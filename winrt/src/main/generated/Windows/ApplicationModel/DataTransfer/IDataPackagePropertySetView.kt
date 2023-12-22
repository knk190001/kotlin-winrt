package Windows.ApplicationModel.DataTransfer

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Uri
import Windows.Storage.Streams.RandomAccessStreamReference
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

@ABIMarker(IDataPackagePropertySetView.ABI::class)
@Signature("{b94cec01-0c1a-4c57-be55-75d01289735d}")
@Guid("b94cec010c1a4c57be5575d01289735d")
@WinRTInterface("b94cec010c1a4c57be5575d01289735d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataPackagePropertySetView.ByReference::class)
public interface IDataPackagePropertySetView : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun get_Description(): String?

  @InterfaceMethod(2)
  public fun get_Thumbnail(): RandomAccessStreamReference?

  @InterfaceMethod(3)
  public fun get_FileTypes(): IVectorView<String?>?

  @InterfaceMethod(4)
  public fun get_ApplicationName(): String?

  @InterfaceMethod(5)
  public fun get_ApplicationListingUri(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataPackagePropertySetView> {
    public override fun getValue() = ABI.makeIDataPackagePropertySetView(pointer.getPointer(0))

    public fun setValue(value: IDataPackagePropertySetView_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataPackagePropertySetView {
    public val __2143708672_Ptr: Pointer?

    public val _2143708672_VtblPtr: Pointer?
      get() = __2143708672_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _2143708672_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2143708672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Description(): String? {
      val fnPtr = _2143708672_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2143708672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Thumbnail(): RandomAccessStreamReference? {
      val fnPtr = _2143708672_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__2143708672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FileTypes(): IVectorView<String?>? {
      val fnPtr = _2143708672_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__2143708672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ApplicationName(): String? {
      val fnPtr = _2143708672_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2143708672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ApplicationListingUri(): Uri? {
      val fnPtr = _2143708672_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__2143708672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IDataPackagePropertySetView_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2143708672_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataPackagePropertySetView, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b94cec010c1a4c57be5575d01289735d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataPackagePropertySetView(ptr: Pointer?): WithDefault =
        IDataPackagePropertySetView_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataPackagePropertySetView {
      val address = segment.toRawLongValue()
      return makeIDataPackagePropertySetView(Pointer(address))
    }

    public override fun toNative(obj: IDataPackagePropertySetView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2143708672_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataPackagePropertySetView):
        Array<IDataPackagePropertySetView?> = (elements as
        Array<IDataPackagePropertySetView?>).castToImpl<IDataPackagePropertySetView,IDataPackagePropertySetView_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataPackagePropertySetView?> =
        arrayOfNulls<IDataPackagePropertySetView_Impl>(size) as Array<IDataPackagePropertySetView?>
  }
}
