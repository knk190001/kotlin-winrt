package Windows.UI.Core

import Windows.UI.Core.ICoreWindowEventArgs.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICharacterReceivedEventArgs.ABI::class)
@Signature("{c584659f-99b2-4bcc-bd33-04e63f42902e}")
@Guid("c584659f99b24bccbd3304e63f42902e")
@WinRTInterface("c584659f99b24bccbd3304e63f42902e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICharacterReceivedEventArgs.ByReference::class)
public interface ICharacterReceivedEventArgs : NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
  @InterfaceMethod(0)
  public fun get_KeyCode(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_KeyStatus(): CorePhysicalKeyStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICharacterReceivedEventArgs> {
    public override fun getValue() = ABI.makeICharacterReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICharacterReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICharacterReceivedEventArgs, ICoreWindowEventArgs.WithDefault {
    public val __1037800872_Ptr: Pointer?

    public val _1037800872_VtblPtr: Pointer?
      get() = __1037800872_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyCode(): WinDef.UINT {
      val fnPtr = _1037800872_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1037800872_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_KeyStatus(): CorePhysicalKeyStatus? {
      val fnPtr = _1037800872_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CorePhysicalKeyStatus>()
      val hr = fn.invokeHR(arrayOf(__1037800872_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CorePhysicalKeyStatus>(result.getValue())
      return resultValue
    }
  }

  public class ICharacterReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ICoreWindowEventArgs {
    public override val __407060269_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1037800872_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1037800872_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICharacterReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c584659f99b24bccbd3304e63f42902e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICharacterReceivedEventArgs(ptr: Pointer?): WithDefault =
        ICharacterReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICharacterReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeICharacterReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICharacterReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1037800872_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICharacterReceivedEventArgs):
        Array<ICharacterReceivedEventArgs?> = (elements as
        Array<ICharacterReceivedEventArgs?>).castToImpl<ICharacterReceivedEventArgs,ICharacterReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICharacterReceivedEventArgs?> =
        arrayOfNulls<ICharacterReceivedEventArgs_Impl>(size) as Array<ICharacterReceivedEventArgs?>
  }
}
