package Windows.Networking.Proximity

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
import java.lang.foreign.ValueLayout.JAVA_LONG
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import kotlin.Int
import kotlin.Long
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmStatic
import kotlin.reflect.jvm.javaMethod
import kotlin.reflect.typeOf

public fun interface MessageTransmittedHandlerBody {
  public operator fun invoke(sender: ProximityDevice?, messageId: Long): Unit
}

@ABIMarker(MessageTransmittedHandler.ABI::class)
@Signature("delegate({efaa0b4a-f6e2-4d7d-856c-78fc8efc021e})")
@WinRTByReference(brClass = MessageTransmittedHandler.ByReference::class)
public class MessageTransmittedHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(sender: ProximityDevice?, messageId: Long): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,sender, messageId))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(MessageTransmittedHandler::class.java, "nativeFn",
      MethodType.methodType(Int::class.java, 
      MessageTransmittedHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, Long::class.java, )
    )


    public operator fun invoke(fn: MessageTransmittedHandlerBody): MessageTransmittedHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS, JAVA_LONG),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = MessageTransmittedHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: MessageTransmittedHandlerBody,
      thisObj: MemoryAddress,
      sender: MemoryAddress,
      messageId: Long
    ): Int {
      try {
        val sender_Managed = ProximityDevice.ABI.fromNative(sender) as ProximityDevice
        fn(sender_Managed, messageId)
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
      sender: ProximityDevice?,
      messageId: Long
    ): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MessageTransmittedHandler> {
    public override fun getValue(): MessageTransmittedHandler =
        MessageTransmittedHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: MessageTransmittedHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<MessageTransmittedHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("efaa0b4af6e24d7d856c78fc8efc021e")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress): MessageTransmittedHandler {
      val address = segment.toRawLongValue()
      return MessageTransmittedHandler(Pointer(address))
    }

    public override fun toNative(obj: MessageTransmittedHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
