package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVector
import Windows.Networking.Vpn.IVpnCustomPromptElement.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IVpnCustomPromptOptionSelector.ABI::class)
@Signature("{3b8f34d9-8ec1-4e95-9a4e-7ba64d38f330}")
@Guid("3b8f34d98ec14e959a4e7ba64d38f330")
@WinRTInterface("3b8f34d98ec14e959a4e7ba64d38f330")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnCustomPromptOptionSelector.ByReference::class)
public interface IVpnCustomPromptOptionSelector : NativeMapped, IWinRTInterface,
    IVpnCustomPromptElement {
  @InterfaceMethod(0)
  public fun get_Options(): IVector<String?>?

  @InterfaceMethod(1)
  public fun get_SelectedIndex(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnCustomPromptOptionSelector> {
    public override fun getValue() = ABI.makeIVpnCustomPromptOptionSelector(pointer.getPointer(0))

    public fun setValue(value: IVpnCustomPromptOptionSelector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnCustomPromptOptionSelector, IVpnCustomPromptElement.WithDefault
      {
    public val __1698298489_Ptr: Pointer?

    public val _1698298489_VtblPtr: Pointer?
      get() = __1698298489_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Options(): IVector<String?>? {
      val fnPtr = _1698298489_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1698298489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SelectedIndex(): WinDef.UINT {
      val fnPtr = _1698298489_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1698298489_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IVpnCustomPromptOptionSelector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnCustomPromptElement {
    public override val __104557463_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1698298489_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1698298489_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnCustomPromptOptionSelector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b8f34d98ec14e959a4e7ba64d38f330")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnCustomPromptOptionSelector(ptr: Pointer?): WithDefault =
        IVpnCustomPromptOptionSelector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnCustomPromptOptionSelector {
      val address = segment.toRawLongValue()
      return makeIVpnCustomPromptOptionSelector(Pointer(address))
    }

    public override fun toNative(obj: IVpnCustomPromptOptionSelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1698298489_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnCustomPromptOptionSelector):
        Array<IVpnCustomPromptOptionSelector?> = (elements as
        Array<IVpnCustomPromptOptionSelector?>).castToImpl<IVpnCustomPromptOptionSelector,IVpnCustomPromptOptionSelector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnCustomPromptOptionSelector?> =
        arrayOfNulls<IVpnCustomPromptOptionSelector_Impl>(size) as
        Array<IVpnCustomPromptOptionSelector?>
  }
}
