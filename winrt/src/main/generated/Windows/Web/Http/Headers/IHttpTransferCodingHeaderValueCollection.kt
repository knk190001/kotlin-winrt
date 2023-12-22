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

@ABIMarker(IHttpTransferCodingHeaderValueCollection.ABI::class)
@Signature("{202c8c34-2c03-49b8-9665-73e27cb2fc79}")
@Guid("202c8c342c0349b8966573e27cb2fc79")
@WinRTInterface("202c8c342c0349b8966573e27cb2fc79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpTransferCodingHeaderValueCollection.ByReference::class)
public interface IHttpTransferCodingHeaderValueCollection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ParseAdd(input: String?): Unit

  @InterfaceMethod(1)
  public fun TryParseAdd(input: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpTransferCodingHeaderValueCollection> {
    public override fun getValue() =
        ABI.makeIHttpTransferCodingHeaderValueCollection(pointer.getPointer(0))

    public fun setValue(value: IHttpTransferCodingHeaderValueCollection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpTransferCodingHeaderValueCollection {
    public val __78456319_Ptr: Pointer?

    public val _78456319_VtblPtr: Pointer?
      get() = __78456319_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ParseAdd(input: String?): Unit {
      val fnPtr = _78456319_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__78456319_Ptr, marshalToNative(input),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun TryParseAdd(input: String?): Boolean {
      val fnPtr = _78456319_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__78456319_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpTransferCodingHeaderValueCollection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __78456319_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpTransferCodingHeaderValueCollection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("202c8c342c0349b8966573e27cb2fc79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpTransferCodingHeaderValueCollection(ptr: Pointer?): WithDefault =
        IHttpTransferCodingHeaderValueCollection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpTransferCodingHeaderValueCollection {
      val address = segment.toRawLongValue()
      return makeIHttpTransferCodingHeaderValueCollection(Pointer(address))
    }

    public override fun toNative(obj: IHttpTransferCodingHeaderValueCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__78456319_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpTransferCodingHeaderValueCollection):
        Array<IHttpTransferCodingHeaderValueCollection?> = (elements as
        Array<IHttpTransferCodingHeaderValueCollection?>).castToImpl<IHttpTransferCodingHeaderValueCollection,IHttpTransferCodingHeaderValueCollection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpTransferCodingHeaderValueCollection?> =
        arrayOfNulls<IHttpTransferCodingHeaderValueCollection_Impl>(size) as
        Array<IHttpTransferCodingHeaderValueCollection?>
  }
}
