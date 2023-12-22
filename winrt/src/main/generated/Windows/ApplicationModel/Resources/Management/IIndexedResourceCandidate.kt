package Windows.ApplicationModel.Resources.Management

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Uri
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

@ABIMarker(IIndexedResourceCandidate.ABI::class)
@Signature("{0e619ef3-faec-4414-a9d7-54acd5953f29}")
@Guid("0e619ef3faec4414a9d754acd5953f29")
@WinRTInterface("0e619ef3faec4414a9d754acd5953f29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIndexedResourceCandidate.ByReference::class)
public interface IIndexedResourceCandidate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): IndexedResourceType?

  @InterfaceMethod(1)
  public fun get_Uri(): Uri?

  @InterfaceMethod(2)
  public fun get_Metadata(): IMapView<String?, String?>?

  @InterfaceMethod(3)
  public fun get_Qualifiers(): IVectorView<IndexedResourceQualifier?>?

  @InterfaceMethod(4)
  public fun get_ValueAsString(): String?

  @InterfaceMethod(5)
  public fun GetQualifierValue(qualifierName: String?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIndexedResourceCandidate> {
    public override fun getValue() = ABI.makeIIndexedResourceCandidate(pointer.getPointer(0))

    public fun setValue(value: IIndexedResourceCandidate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIndexedResourceCandidate {
    public val __1585809079_Ptr: Pointer?

    public val _1585809079_VtblPtr: Pointer?
      get() = __1585809079_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): IndexedResourceType? {
      val fnPtr = _1585809079_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IndexedResourceType>()
      val hr = fn.invokeHR(arrayOf(__1585809079_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IndexedResourceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1585809079_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1585809079_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Metadata(): IMapView<String?, String?>? {
      val fnPtr = _1585809079_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__1585809079_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Qualifiers(): IVectorView<IndexedResourceQualifier?>? {
      val fnPtr = _1585809079_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IndexedResourceQualifier?>>()
      val hr = fn.invokeHR(arrayOf(__1585809079_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IndexedResourceQualifier?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ValueAsString(): String? {
      val fnPtr = _1585809079_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1585809079_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetQualifierValue(qualifierName: String?): String? {
      val fnPtr = _1585809079_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1585809079_Ptr, marshalToNative(qualifierName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IIndexedResourceCandidate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1585809079_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIndexedResourceCandidate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e619ef3faec4414a9d754acd5953f29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIndexedResourceCandidate(ptr: Pointer?): WithDefault =
        IIndexedResourceCandidate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIndexedResourceCandidate {
      val address = segment.toRawLongValue()
      return makeIIndexedResourceCandidate(Pointer(address))
    }

    public override fun toNative(obj: IIndexedResourceCandidate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1585809079_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIndexedResourceCandidate):
        Array<IIndexedResourceCandidate?> = (elements as
        Array<IIndexedResourceCandidate?>).castToImpl<IIndexedResourceCandidate,IIndexedResourceCandidate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIndexedResourceCandidate?> =
        arrayOfNulls<IIndexedResourceCandidate_Impl>(size) as Array<IIndexedResourceCandidate?>
  }
}
