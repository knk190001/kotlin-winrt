package Windows.ApplicationModel.Background

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

public fun interface BackgroundTaskCanceledEventHandlerBody {
  public operator fun invoke(sender: IBackgroundTaskInstance?,
      reason: BackgroundTaskCancellationReason?): Unit
}

@ABIMarker(BackgroundTaskCanceledEventHandler.ABI::class)
@Signature("delegate({a6c4bac0-51f8-4c57-ac3f-156dd1680c4f})")
@WinRTByReference(brClass = BackgroundTaskCanceledEventHandler.ByReference::class)
public class BackgroundTaskCanceledEventHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(sender: IBackgroundTaskInstance?, reason: BackgroundTaskCancellationReason?):
      Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,sender?.toNative() as Pointer, reason))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(BackgroundTaskCanceledEventHandler::class.java,
        "nativeFn",
      MethodType.methodType(Int::class.java, 
      BackgroundTaskCanceledEventHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, Int::class.java, )
    )


    public operator fun invoke(fn: BackgroundTaskCanceledEventHandlerBody):
        BackgroundTaskCanceledEventHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, JAVA_INT),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = BackgroundTaskCanceledEventHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: BackgroundTaskCanceledEventHandlerBody,
      thisObj: MemoryAddress,
      sender: MemoryAddress,
      reason: Int
    ): Int {
      try {
        val sender_Managed = IBackgroundTaskInstance.ABI.fromNative(sender) as
            IBackgroundTaskInstance
        val reason_Managed = BackgroundTaskCancellationReason.ABI.fromNative(reason) as
            BackgroundTaskCancellationReason
        fn(sender_Managed, reason_Managed)
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
      sender: Pointer,
      reason: BackgroundTaskCancellationReason?
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BackgroundTaskCanceledEventHandler> {
    public override fun getValue(): BackgroundTaskCanceledEventHandler =
        BackgroundTaskCanceledEventHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: BackgroundTaskCanceledEventHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<BackgroundTaskCanceledEventHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("a6c4bac051f84c57ac3f156dd1680c4f")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): BackgroundTaskCanceledEventHandler {
      val address = segment.toRawLongValue()
      return BackgroundTaskCanceledEventHandler(Pointer(address))
    }

    public override fun toNative(obj: BackgroundTaskCanceledEventHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
