package Windows.Networking.Vpn

import Windows.Foundation.Collections.IVectorView
import Windows.Networking.Vpn.IVpnCustomPrompt.ABI.IID
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

@ABIMarker(IVpnCustomComboBox.ABI::class)
@Signature("{9a24158e-dba1-4c6f-8270-dcf3c9761c4c}")
@Guid("9a24158edba14c6f8270dcf3c9761c4c")
@WinRTInterface("9a24158edba14c6f8270dcf3c9761c4c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVpnCustomComboBox.ByReference::class)
public interface IVpnCustomComboBox : NativeMapped, IWinRTInterface, IVpnCustomPrompt {
  @InterfaceMethod(0)
  public fun put_OptionsText(value: IVectorView<String?>?): Unit

  @InterfaceMethod(1)
  public fun get_OptionsText(): IVectorView<String?>?

  @InterfaceMethod(2)
  public fun get_Selected(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVpnCustomComboBox> {
    public override fun getValue() = ABI.makeIVpnCustomComboBox(pointer.getPointer(0))

    public fun setValue(value: IVpnCustomComboBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVpnCustomComboBox, IVpnCustomPrompt.WithDefault {
    public val __1381813410_Ptr: Pointer?

    public val _1381813410_VtblPtr: Pointer?
      get() = __1381813410_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_OptionsText(value: IVectorView<String?>?): Unit {
      val fnPtr = _1381813410_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1381813410_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_OptionsText(): IVectorView<String?>? {
      val fnPtr = _1381813410_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__1381813410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Selected(): WinDef.UINT {
      val fnPtr = _1381813410_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1381813410_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IVpnCustomComboBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IVpnCustomPrompt {
    public override val __235034533_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1381813410_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1381813410_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVpnCustomComboBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a24158edba14c6f8270dcf3c9761c4c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVpnCustomComboBox(ptr: Pointer?): WithDefault = IVpnCustomComboBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVpnCustomComboBox {
      val address = segment.toRawLongValue()
      return makeIVpnCustomComboBox(Pointer(address))
    }

    public override fun toNative(obj: IVpnCustomComboBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1381813410_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVpnCustomComboBox): Array<IVpnCustomComboBox?> =
        (elements as
        Array<IVpnCustomComboBox?>).castToImpl<IVpnCustomComboBox,IVpnCustomComboBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVpnCustomComboBox?> =
        arrayOfNulls<IVpnCustomComboBox_Impl>(size) as Array<IVpnCustomComboBox?>
  }
}
