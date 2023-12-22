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

@ABIMarker(IHttpContentCodingWithQualityHeaderValueCollection.ABI::class)
@Signature("{7c0d753e-e899-4378-b5c8-412d820711cc}")
@Guid("7c0d753ee8994378b5c8412d820711cc")
@WinRTInterface("7c0d753ee8994378b5c8412d820711cc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpContentCodingWithQualityHeaderValueCollection.ByReference::class)
public interface IHttpContentCodingWithQualityHeaderValueCollection : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun ParseAdd(input: String?): Unit

  @InterfaceMethod(1)
  public fun TryParseAdd(input: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpContentCodingWithQualityHeaderValueCollection> {
    public override fun getValue() =
        ABI.makeIHttpContentCodingWithQualityHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: IHttpContentCodingWithQualityHeaderValueCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpContentCodingWithQualityHeaderValueCollection {
    public val __1857632960_Ptr: Pointer?

    public val _1857632960_VtblPtr: Pointer?
      get() = __1857632960_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ParseAdd(input: String?): Unit {
      val fnPtr = _1857632960_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1857632960_Ptr, marshalToNative(input),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun TryParseAdd(input: String?): Boolean {
      val fnPtr = _1857632960_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1857632960_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpContentCodingWithQualityHeaderValueCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1857632960_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpContentCodingWithQualityHeaderValueCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c0d753ee8994378b5c8412d820711cc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpContentCodingWithQualityHeaderValueCollection(ptr: Pointer?): WithDefault =
        IHttpContentCodingWithQualityHeaderValueCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpContentCodingWithQualityHeaderValueCollection {
      val address = segment.toRawLongValue()
      return makeIHttpContentCodingWithQualityHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: IHttpContentCodingWithQualityHeaderValueCollection):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1857632960_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpContentCodingWithQualityHeaderValueCollection):
        Array<IHttpContentCodingWithQualityHeaderValueCollection?> = (elements as
        Array<IHttpContentCodingWithQualityHeaderValueCollection?>).castToImpl<IHttpContentCodingWithQualityHeaderValueCollection,IHttpContentCodingWithQualityHeaderValueCollection_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IHttpContentCodingWithQualityHeaderValueCollection?> =
        arrayOfNulls<IHttpContentCodingWithQualityHeaderValueCollection_Impl>(size) as
        Array<IHttpContentCodingWithQualityHeaderValueCollection?>
  }
}
