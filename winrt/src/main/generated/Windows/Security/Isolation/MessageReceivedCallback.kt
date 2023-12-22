package Windows.Security.Isolation

import Windows.Foundation.Collections.IVectorView
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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import java.lang.foreign.MemoryLayout
import java.lang.foreign.MemorySegment
import java.lang.foreign.MemorySession
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import java.lang.foreign.ValueLayout.JAVA_INT
import java.lang.foreign.ValueLayout.JAVA_LONG
import java.lang.foreign.ValueLayout.JAVA_SHORT
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.typeOf

public fun interface MessageReceivedCallbackBody {
  public operator fun invoke(receiverId: Guid.GUID?, message: IVectorView<IUnknown?>?): Unit
}

@ABIMarker(MessageReceivedCallback.ABI::class)
@Signature("delegate({f5b4c8ff-1d9d-4995-9fea-4d15257c0757})")
@WinRTByReference(brClass = MessageReceivedCallback.ByReference::class)
public class MessageReceivedCallback(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(receiverId: Guid.GUID?, message: IVectorView<IUnknown?>?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,receiverId, message?.toNative() as Pointer))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(MessageReceivedCallback::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      MessageReceivedCallbackBody::class.java, MemoryAddress::class.java, MemorySegment::class.java,
          MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: MessageReceivedCallbackBody): MessageReceivedCallback {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , MemoryLayout.structLayout(
          JAVA_INT,
          JAVA_SHORT, 
          JAVA_SHORT,
          JAVA_LONG
        )
        , ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = MessageReceivedCallback(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: MessageReceivedCallbackBody,
      thisObj: MemoryAddress,
      receiverId: MemorySegment,
      message: MemoryAddress
    ): Int {
      try {
        val receiverId_Managed = guidFromNative(receiverId)
        val message_Managed = IVectorView.ABI.fromNative(typeOf<IVectorView<IUnknown?>>(), message)
            as IVectorView<IUnknown?>
        fn(receiverId_Managed, message_Managed)
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
      receiverId: Guid.GUID?,
      message: Pointer
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MessageReceivedCallback> {
    public override fun getValue(): MessageReceivedCallback =
        MessageReceivedCallback(pointer.getPointer(0))

    public fun setValue(`delegate`: MessageReceivedCallback): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<MessageReceivedCallback, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("f5b4c8ff1d9d49959fea4d15257c0757")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): MessageReceivedCallback {
      val address = segment.toRawLongValue()
      return MessageReceivedCallback(Pointer(address))
    }

    public override fun toNative(obj: MessageReceivedCallback): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
