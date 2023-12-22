package Windows.Devices.PointOfService

import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPosPrinterFontProperty.ABI::class)
@Signature("{a7f4e93a-f8ac-5f04-84d2-29b16d8a633c}")
@Guid("a7f4e93af8ac5f0484d229b16d8a633c")
@WinRTInterface("a7f4e93af8ac5f0484d229b16d8a633c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPosPrinterFontProperty.ByReference::class)
public interface IPosPrinterFontProperty : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TypeFace(): String?

  @InterfaceMethod(1)
  public fun get_IsScalableToAnySize(): Boolean

  @InterfaceMethod(2)
  public fun get_CharacterSizes(): IVectorView<SizeUInt32?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPosPrinterFontProperty> {
    public override fun getValue() = ABI.makeIPosPrinterFontProperty(pointer.getPointer(0))

    public fun setValue(value: IPosPrinterFontProperty_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPosPrinterFontProperty {
    public val __933624681_Ptr: Pointer?

    public val _933624681_VtblPtr: Pointer?
      get() = __933624681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TypeFace(): String? {
      val fnPtr = _933624681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__933624681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsScalableToAnySize(): Boolean {
      val fnPtr = _933624681_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__933624681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CharacterSizes(): IVectorView<SizeUInt32?>? {
      val fnPtr = _933624681_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SizeUInt32?>>()
      val hr = fn.invokeHR(arrayOf(__933624681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<SizeUInt32?>>(result.getValue())
      return resultValue
    }
  }

  public class IPosPrinterFontProperty_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __933624681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPosPrinterFontProperty, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7f4e93af8ac5f0484d229b16d8a633c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPosPrinterFontProperty(ptr: Pointer?): WithDefault =
        IPosPrinterFontProperty_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPosPrinterFontProperty {
      val address = segment.toRawLongValue()
      return makeIPosPrinterFontProperty(Pointer(address))
    }

    public override fun toNative(obj: IPosPrinterFontProperty): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__933624681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPosPrinterFontProperty): Array<IPosPrinterFontProperty?>
        = (elements as
        Array<IPosPrinterFontProperty?>).castToImpl<IPosPrinterFontProperty,IPosPrinterFontProperty_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPosPrinterFontProperty?> =
        arrayOfNulls<IPosPrinterFontProperty_Impl>(size) as Array<IPosPrinterFontProperty?>
  }
}
