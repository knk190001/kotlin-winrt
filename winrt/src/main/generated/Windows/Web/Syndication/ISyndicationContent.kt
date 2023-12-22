package Windows.Web.Syndication

import Windows.Foundation.Uri
import Windows.Web.Syndication.ISyndicationText.ABI.IID
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISyndicationContent.ABI::class)
@Signature("{4641fefe-0e55-40d0-b8d0-6a2ccba9fc7c}")
@Guid("4641fefe0e5540d0b8d06a2ccba9fc7c")
@WinRTInterface("4641fefe0e5540d0b8d06a2ccba9fc7c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationContent.ByReference::class)
public interface ISyndicationContent : NativeMapped, IWinRTInterface, ISyndicationText,
    ISyndicationNode {
  @InterfaceMethod(0)
  public fun get_SourceUri(): Uri?

  @InterfaceMethod(1)
  public fun put_SourceUri(value: Uri?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationContent> {
    public override fun getValue() = ABI.makeISyndicationContent(pointer.getPointer(0))

    public fun setValue(value: ISyndicationContent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationContent, ISyndicationText.WithDefault,
      ISyndicationNode.WithDefault {
    public val __987143479_Ptr: Pointer?

    public val _987143479_VtblPtr: Pointer?
      get() = __987143479_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceUri(): Uri? {
      val fnPtr = _987143479_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__987143479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SourceUri(value: Uri?): Unit {
      val fnPtr = _987143479_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__987143479_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISyndicationContent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISyndicationText,
      ISyndicationNode {
    public override val __1576322851_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_987143479_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1576492622_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(ISyndicationNode.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_987143479_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __987143479_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationContent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4641fefe0e5540d0b8d06a2ccba9fc7c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationContent(ptr: Pointer?): WithDefault = ISyndicationContent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationContent {
      val address = segment.toRawLongValue()
      return makeISyndicationContent(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__987143479_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationContent): Array<ISyndicationContent?> =
        (elements as
        Array<ISyndicationContent?>).castToImpl<ISyndicationContent,ISyndicationContent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationContent?> =
        arrayOfNulls<ISyndicationContent_Impl>(size) as Array<ISyndicationContent?>
  }
}
