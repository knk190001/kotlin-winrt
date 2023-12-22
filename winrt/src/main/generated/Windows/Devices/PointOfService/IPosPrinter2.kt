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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IPosPrinter2.ABI::class)
@Signature("{248475e8-8b98-5517-8e48-760e86f68987}")
@Guid("248475e88b9855178e48760e86f68987")
@WinRTInterface("248475e88b9855178e48760e86f68987")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPosPrinter2.ByReference::class)
public interface IPosPrinter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedBarcodeSymbologies(): IVectorView<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun GetFontProperty(typeface: String?): PosPrinterFontProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPosPrinter2> {
    public override fun getValue() = ABI.makeIPosPrinter2(pointer.getPointer(0))

    public fun setValue(value: IPosPrinter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPosPrinter2 {
    public val __617527629_Ptr: Pointer?

    public val _617527629_VtblPtr: Pointer?
      get() = __617527629_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedBarcodeSymbologies(): IVectorView<WinDef.UINT>? {
      val fnPtr = _617527629_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__617527629_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetFontProperty(typeface: String?): PosPrinterFontProperty? {
      val fnPtr = _617527629_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterFontProperty>()
      val hr = fn.invokeHR(arrayOf(__617527629_Ptr, marshalToNative(typeface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterFontProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPosPrinter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __617527629_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPosPrinter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("248475e88b9855178e48760e86f68987")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPosPrinter2(ptr: Pointer?): WithDefault = IPosPrinter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPosPrinter2 {
      val address = segment.toRawLongValue()
      return makeIPosPrinter2(Pointer(address))
    }

    public override fun toNative(obj: IPosPrinter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__617527629_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPosPrinter2): Array<IPosPrinter2?> = (elements as
        Array<IPosPrinter2?>).castToImpl<IPosPrinter2,IPosPrinter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPosPrinter2?> =
        arrayOfNulls<IPosPrinter2_Impl>(size) as Array<IPosPrinter2?>
  }
}
