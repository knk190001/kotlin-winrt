package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.ABI
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.arrayFromNative
import com.github.knk190001.winrtbinding.runtime.base.Delegate
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.booleanFromNative
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.guidFromNative
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.iUnknownIID
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.setValue
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.CallbackReference
import com.sun.jna.Function
import com.sun.jna.Memory
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.platform.win32.WinNT
import com.sun.jna.win32.StdCallLibrary
import java.lang.foreign.FunctionDescriptor
import java.lang.foreign.Linker
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.typeOf

public fun interface AsyncActionCompletedHandlerBody {
  public operator fun invoke(asyncInfo: IAsyncAction?, asyncStatus: AsyncStatus?): Unit
}

@ABIMarker(AsyncActionCompletedHandler.ABI::class)
@Signature("delegate({a4ed5c81-76c9-40bd-8be6-b1d90fb20ae7})")
@WinRTByReference(brClass = AsyncActionCompletedHandler.ByReference::class)
public class AsyncActionCompletedHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(asyncInfo: IAsyncAction?, asyncStatus: AsyncStatus?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,asyncInfo?.toNative() as Pointer, asyncStatus))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(AsyncActionCompletedHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      AsyncActionCompletedHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, Int::class.java, )
    )


    public operator fun invoke(fn: AsyncActionCompletedHandlerBody): AsyncActionCompletedHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, JAVA_INT),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = AsyncActionCompletedHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: AsyncActionCompletedHandlerBody,
      thisObj: MemoryAddress,
      asyncInfo: MemoryAddress,
      asyncStatus: Int
    ): Int {
      try {
        val asyncInfo_Managed = IAsyncAction.ABI.fromNative(asyncInfo) as IAsyncAction
        val asyncStatus_Managed = AsyncStatus.ABI.fromNative(asyncStatus) as AsyncStatus
        fn(asyncInfo_Managed, asyncStatus_Managed)
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(
      thisPtr: Pointer,
      asyncInfo: Pointer,
      asyncStatus: AsyncStatus?
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AsyncActionCompletedHandler> {
    public override fun getValue(): AsyncActionCompletedHandler =
        AsyncActionCompletedHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: AsyncActionCompletedHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<AsyncActionCompletedHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("a4ed5c8176c940bd8be6b1d90fb20ae7")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): AsyncActionCompletedHandler {
      val address = segment.toRawLongValue()
      return AsyncActionCompletedHandler(Pointer(address))
    }

    public override fun toNative(obj: AsyncActionCompletedHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
