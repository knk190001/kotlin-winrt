package Windows.Web.Syndication

import Windows.Data.Xml.Dom.XmlDocument
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

@ABIMarker(ISyndicationText.ABI::class)
@Signature("{b9cc5e80-313a-4091-a2a6-243e0ee923f9}")
@Guid("b9cc5e80313a4091a2a6243e0ee923f9")
@WinRTInterface("b9cc5e80313a4091a2a6243e0ee923f9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationText.ByReference::class)
public interface ISyndicationText : NativeMapped, IWinRTInterface, ISyndicationNode {
  @InterfaceMethod(0)
  public fun get_Text(): String?

  @InterfaceMethod(1)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Type(): String?

  @InterfaceMethod(3)
  public fun put_Type(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Xml(): XmlDocument?

  @InterfaceMethod(5)
  public fun put_Xml(value: XmlDocument?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationText> {
    public override fun getValue() = ABI.makeISyndicationText(pointer.getPointer(0))

    public fun setValue(value: ISyndicationText_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationText, ISyndicationNode.WithDefault {
    public val __1576322851_Ptr: Pointer?

    public val _1576322851_VtblPtr: Pointer?
      get() = __1576322851_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Text(): String? {
      val fnPtr = _1576322851_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1576322851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _1576322851_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576322851_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Type(): String? {
      val fnPtr = _1576322851_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1576322851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Type(value: String?): Unit {
      val fnPtr = _1576322851_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576322851_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Xml(): XmlDocument? {
      val fnPtr = _1576322851_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__1576322851_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Xml(value: XmlDocument?): Unit {
      val fnPtr = _1576322851_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576322851_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISyndicationText_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISyndicationNode {
    public override val __1576492622_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1576322851_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1576322851_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationText, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9cc5e80313a4091a2a6243e0ee923f9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationText(ptr: Pointer?): WithDefault = ISyndicationText_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationText {
      val address = segment.toRawLongValue()
      return makeISyndicationText(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationText): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1576322851_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationText): Array<ISyndicationText?> = (elements as
        Array<ISyndicationText?>).castToImpl<ISyndicationText,ISyndicationText_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationText?> =
        arrayOfNulls<ISyndicationText_Impl>(size) as Array<ISyndicationText?>
  }
}
