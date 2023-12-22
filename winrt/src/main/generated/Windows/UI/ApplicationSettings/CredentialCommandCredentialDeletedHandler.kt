package Windows.UI.ApplicationSettings

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

public fun interface CredentialCommandCredentialDeletedHandlerBody {
  public operator fun invoke(command: CredentialCommand?): Unit
}

@ABIMarker(CredentialCommandCredentialDeletedHandler.ABI::class)
@Signature("delegate({61c0e185-0977-4678-b4e2-98727afbeed9})")
@WinRTByReference(brClass = CredentialCommandCredentialDeletedHandler.ByReference::class)
public class CredentialCommandCredentialDeletedHandler(
  ptr: Pointer? = Pointer.NULL
) : Delegate(ptr) {
  public fun invoke(command: CredentialCommand?): Unit {
    val function = Function.getFunction(delegateStruct.fn!!)
    val hr = function.invokeHR(arrayOf(this.pointer,command))
    checkHR(hr)
  }

  public companion object {
    private val nativeFnHandle: MethodHandle =
        MethodHandles.lookup().findStatic(CredentialCommandCredentialDeletedHandler::class.java,
        "nativeFn",
      MethodType.methodType(Int::class.java, 
      CredentialCommandCredentialDeletedHandlerBody::class.java, MemoryAddress::class.java,
          MemoryAddress::class.java, )
    )


    public operator fun invoke(fn: CredentialCommandCredentialDeletedHandlerBody):
        CredentialCommandCredentialDeletedHandler {
      val session = MemorySession.global()
      val stub = Linker.nativeLinker().upcallStub(
        nativeFnHandle.bindTo(fn),
        FunctionDescriptor.of(JAVA_INT, ADDRESS 
        , ADDRESS),
        session)
      val nativeFn = CallbackReference.getCallback(Native::class.java,
          Pointer(stub.address().toRawLongValue())) as Native
      val newDelegate = CredentialCommandCredentialDeletedHandler(Memory(12))
      newDelegate.init(listOf(ABI.IID,iUnknownIID), nativeFn)
      return newDelegate
    }

    @JvmStatic
    @Suppress("UNCHECKED_CAST")
    public fun nativeFn(
      fn: CredentialCommandCredentialDeletedHandlerBody,
      thisObj: MemoryAddress,
      command: MemoryAddress
    ): Int {
      try {
        val command_Managed = CredentialCommand.ABI.fromNative(command) as CredentialCommand
        fn(command_Managed)
      } catch (e: Throwable) {
        e.printStackTrace()
        return WinNT.E_FAIL
      }
      return 0
    }
  }

  public fun interface Native : StdCallLibrary.StdCallCallback {
    public fun invoke(thisPtr: Pointer, command: CredentialCommand?): WinNT.HRESULT
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CredentialCommandCredentialDeletedHandler> {
    public override fun getValue(): CredentialCommandCredentialDeletedHandler =
        CredentialCommandCredentialDeletedHandler(pointer.getPointer(0))

    public fun setValue(`delegate`: CredentialCommandCredentialDeletedHandler): Unit {
      pointer.setPointer(0, delegate.pointer)
    }
  }

  public object ABI : IABI<CredentialCommandCredentialDeletedHandler, MemoryAddress> {
    public val IID: Guid.IID = Guid.IID("61c0e18509774678b4e298727afbeed9")

    public override val layout: ValueLayout = ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CredentialCommandCredentialDeletedHandler {
      val address = segment.toRawLongValue()
      return CredentialCommandCredentialDeletedHandler(Pointer(address))
    }

    public override fun toNative(obj: CredentialCommandCredentialDeletedHandler): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
