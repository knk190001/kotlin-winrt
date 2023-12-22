package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.Uri
import Windows.Storage.Streams.IRandomAccessStreamReference
import Windows.UI.Color
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDataPackagePropertySetView2.ABI::class)
@Signature("{6054509b-8ebe-4feb-9c1e-75e69de54b84}")
@Guid("6054509b8ebe4feb9c1e75e69de54b84")
@WinRTInterface("6054509b8ebe4feb9c1e75e69de54b84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackagePropertySetView2.ByReference::class)
public interface IDataPackagePropertySetView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PackageFamilyName(): String?

  @InterfaceMethod(1)
  public fun get_ContentSourceWebLink(): Uri?

  @InterfaceMethod(2)
  public fun get_ContentSourceApplicationLink(): Uri?

  @InterfaceMethod(3)
  public fun get_Square30x30Logo(): IRandomAccessStreamReference?

  @InterfaceMethod(4)
  public fun get_LogoBackgroundColor(): Color?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackagePropertySetView2> {
    public override fun getValue() = ABI.makeIDataPackagePropertySetView2(pointer.getPointer(0))

    public fun setValue(value: IDataPackagePropertySetView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackagePropertySetView2 {
    public val __2030459442_Ptr: Pointer?

    public val _2030459442_VtblPtr: Pointer?
      get() = __2030459442_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PackageFamilyName(): String? {
      val fnPtr = _2030459442_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2030459442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ContentSourceWebLink(): Uri? {
      val fnPtr = _2030459442_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__2030459442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ContentSourceApplicationLink(): Uri? {
      val fnPtr = _2030459442_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__2030459442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Square30x30Logo(): IRandomAccessStreamReference? {
      val fnPtr = _2030459442_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__2030459442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_LogoBackgroundColor(): Color? {
      val fnPtr = _2030459442_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__2030459442_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }
  }

  public class IDataPackagePropertySetView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2030459442_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackagePropertySetView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6054509b8ebe4feb9c1e75e69de54b84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackagePropertySetView2(ptr: Pointer?): WithDefault =
        IDataPackagePropertySetView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackagePropertySetView2 {
      val address = segment.toRawLongValue()
      return makeIDataPackagePropertySetView2(Pointer(address))
    }

    public override fun toNative(obj: IDataPackagePropertySetView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2030459442_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackagePropertySetView2):
        Array<IDataPackagePropertySetView2?> = (elements as
        Array<IDataPackagePropertySetView2?>).castToImpl<IDataPackagePropertySetView2,IDataPackagePropertySetView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackagePropertySetView2?> =
        arrayOfNulls<IDataPackagePropertySetView2_Impl>(size) as
        Array<IDataPackagePropertySetView2?>
  }
}
