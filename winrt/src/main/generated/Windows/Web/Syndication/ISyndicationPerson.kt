package Windows.Web.Syndication

import Windows.Foundation.Uri
import Windows.Web.Syndication.ISyndicationNode.ABI.IID
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

@ABIMarker(ISyndicationPerson.ABI::class)
@Signature("{fa1ee5da-a7c6-4517-a096-0143faf29327}")
@Guid("fa1ee5daa7c64517a0960143faf29327")
@WinRTInterface("fa1ee5daa7c64517a0960143faf29327")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationPerson.ByReference::class)
public interface ISyndicationPerson : NativeMapped, IWinRTInterface, ISyndicationNode {
  @InterfaceMethod(0)
  public fun get_Email(): String?

  @InterfaceMethod(1)
  public fun put_Email(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Name(): String?

  @InterfaceMethod(3)
  public fun put_Name(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Uri(): Uri?

  @InterfaceMethod(5)
  public fun put_Uri(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationPerson> {
    public override fun getValue() = ABI.makeISyndicationPerson(pointer.getPointer(0))

    public fun setValue(value: ISyndicationPerson_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationPerson, ISyndicationNode.WithDefault {
    public val __1162502917_Ptr: Pointer?

    public val _1162502917_VtblPtr: Pointer?
      get() = __1162502917_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Email(): String? {
      val fnPtr = _1162502917_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1162502917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Email(value: String?): Unit {
      val fnPtr = _1162502917_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1162502917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Name(): String? {
      val fnPtr = _1162502917_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1162502917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Name(value: String?): Unit {
      val fnPtr = _1162502917_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1162502917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Uri(): Uri? {
      val fnPtr = _1162502917_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1162502917_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Uri(value: Uri?): Unit {
      val fnPtr = _1162502917_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1162502917_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISyndicationPerson_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISyndicationNode {
    public override val __1576492622_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1162502917_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1162502917_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationPerson, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa1ee5daa7c64517a0960143faf29327")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationPerson(ptr: Pointer?): WithDefault = ISyndicationPerson_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationPerson {
      val address = segment.toRawLongValue()
      return makeISyndicationPerson(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationPerson): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1162502917_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationPerson): Array<ISyndicationPerson?> =
        (elements as
        Array<ISyndicationPerson?>).castToImpl<ISyndicationPerson,ISyndicationPerson_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationPerson?> =
        arrayOfNulls<ISyndicationPerson_Impl>(size) as Array<ISyndicationPerson?>
  }
}
