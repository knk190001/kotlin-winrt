package Windows.Graphics.Printing.Workflow

import Windows.ApplicationModel.Activation.IActivatedEventArgs
import Windows.ApplicationModel.Activation.IActivatedEventArgs.ABI.IID
import Windows.ApplicationModel.Activation.IActivatedEventArgsWithUser
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintWorkflowUIActivatedEventArgs.ABI::class)
@Signature("{bc8a844d-09eb-5746-72a6-8dc8b5edbe9b}")
@Guid("bc8a844d09eb574672a68dc8b5edbe9b")
@WinRTInterface("bc8a844d09eb574672a68dc8b5edbe9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowUIActivatedEventArgs.ByReference::class)
public interface IPrintWorkflowUIActivatedEventArgs : NativeMapped, IWinRTInterface,
    IActivatedEventArgs, IActivatedEventArgsWithUser {
  @InterfaceMethod(0)
  public fun get_PrintWorkflowSession(): PrintWorkflowForegroundSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowUIActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowUIActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowUIActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowUIActivatedEventArgs,
      IActivatedEventArgs.WithDefault, IActivatedEventArgsWithUser.WithDefault {
    public val __574372067_Ptr: Pointer?

    public val _574372067_VtblPtr: Pointer?
      get() = __574372067_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrintWorkflowSession(): PrintWorkflowForegroundSession? {
      val fnPtr = _574372067_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowForegroundSession>()
      val hr = fn.invokeHR(arrayOf(__574372067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowForegroundSession>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowUIActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IActivatedEventArgs,
      IActivatedEventArgsWithUser {
    public override val __1721660047_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_574372067_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __988512_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IActivatedEventArgsWithUser.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_574372067_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __574372067_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowUIActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bc8a844d09eb574672a68dc8b5edbe9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowUIActivatedEventArgs(ptr: Pointer?): WithDefault =
        IPrintWorkflowUIActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowUIActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowUIActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowUIActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__574372067_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowUIActivatedEventArgs):
        Array<IPrintWorkflowUIActivatedEventArgs?> = (elements as
        Array<IPrintWorkflowUIActivatedEventArgs?>).castToImpl<IPrintWorkflowUIActivatedEventArgs,IPrintWorkflowUIActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowUIActivatedEventArgs?> =
        arrayOfNulls<IPrintWorkflowUIActivatedEventArgs_Impl>(size) as
        Array<IPrintWorkflowUIActivatedEventArgs?>
  }
}
