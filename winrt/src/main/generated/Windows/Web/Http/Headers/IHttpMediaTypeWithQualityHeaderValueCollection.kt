package Windows.Web.Http.Headers

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

@ABIMarker(IHttpMediaTypeWithQualityHeaderValueCollection.ABI::class)
@Signature("{3c0c6b73-1342-4587-a056-18d02ff67165}")
@Guid("3c0c6b7313424587a05618d02ff67165")
@WinRTInterface("3c0c6b7313424587a05618d02ff67165")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMediaTypeWithQualityHeaderValueCollection.ByReference::class)
public interface IHttpMediaTypeWithQualityHeaderValueCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ParseAdd(input: String?): Unit

  @InterfaceMethod(1)
  public fun TryParseAdd(input: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMediaTypeWithQualityHeaderValueCollection> {
    public override fun getValue() =
        ABI.makeIHttpMediaTypeWithQualityHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: IHttpMediaTypeWithQualityHeaderValueCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMediaTypeWithQualityHeaderValueCollection {
    public val __203246405_Ptr: Pointer?

    public val _203246405_VtblPtr: Pointer?
      get() = __203246405_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ParseAdd(input: String?): Unit {
      val fnPtr = _203246405_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__203246405_Ptr, marshalToNative(input),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun TryParseAdd(input: String?): Boolean {
      val fnPtr = _203246405_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__203246405_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpMediaTypeWithQualityHeaderValueCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __203246405_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMediaTypeWithQualityHeaderValueCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c0c6b7313424587a05618d02ff67165")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMediaTypeWithQualityHeaderValueCollection(ptr: Pointer?): WithDefault =
        IHttpMediaTypeWithQualityHeaderValueCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpMediaTypeWithQualityHeaderValueCollection {
      val address = segment.toRawLongValue()
      return makeIHttpMediaTypeWithQualityHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: IHttpMediaTypeWithQualityHeaderValueCollection): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__203246405_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMediaTypeWithQualityHeaderValueCollection):
        Array<IHttpMediaTypeWithQualityHeaderValueCollection?> = (elements as
        Array<IHttpMediaTypeWithQualityHeaderValueCollection?>).castToImpl<IHttpMediaTypeWithQualityHeaderValueCollection,IHttpMediaTypeWithQualityHeaderValueCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMediaTypeWithQualityHeaderValueCollection?> =
        arrayOfNulls<IHttpMediaTypeWithQualityHeaderValueCollection_Impl>(size) as
        Array<IHttpMediaTypeWithQualityHeaderValueCollection?>
  }
}
