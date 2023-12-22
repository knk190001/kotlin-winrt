package Windows.Web.Syndication

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

@ABIMarker(ISyndicationLinkFactory.ABI::class)
@Signature("{5ed863d4-5535-48ac-98d4-c190995080b3}")
@Guid("5ed863d4553548ac98d4c190995080b3")
@WinRTInterface("5ed863d4553548ac98d4c190995080b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationLinkFactory.ByReference::class)
public interface ISyndicationLinkFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSyndicationLink(uri: Uri?): SyndicationLink?

  @InterfaceMethod(1)
  public fun CreateSyndicationLinkEx(
    uri: Uri?,
    relationship: String?,
    title: String?,
    mediaType: String?,
    length: WinDef.UINT
  ): SyndicationLink?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationLinkFactory> {
    public override fun getValue() = ABI.makeISyndicationLinkFactory(pointer.getPointer(0))

    public fun setValue(value: ISyndicationLinkFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationLinkFactory {
    public val __715746816_Ptr: Pointer?

    public val _715746816_VtblPtr: Pointer?
      get() = __715746816_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSyndicationLink(uri: Uri?): SyndicationLink? {
      val fnPtr = _715746816_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationLink>()
      val hr = fn.invokeHR(arrayOf(__715746816_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationLink>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateSyndicationLinkEx(
      uri: Uri?,
      relationship: String?,
      title: String?,
      mediaType: String?,
      length: WinDef.UINT
    ): SyndicationLink? {
      val fnPtr = _715746816_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationLink>()
      val hr = fn.invokeHR(arrayOf(__715746816_Ptr, marshalToNative(uri),
          marshalToNative(relationship), marshalToNative(title), marshalToNative(mediaType), length,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationLink>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationLinkFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __715746816_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationLinkFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ed863d4553548ac98d4c190995080b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationLinkFactory(ptr: Pointer?): WithDefault =
        ISyndicationLinkFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationLinkFactory {
      val address = segment.toRawLongValue()
      return makeISyndicationLinkFactory(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationLinkFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__715746816_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationLinkFactory): Array<ISyndicationLinkFactory?>
        = (elements as
        Array<ISyndicationLinkFactory?>).castToImpl<ISyndicationLinkFactory,ISyndicationLinkFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationLinkFactory?> =
        arrayOfNulls<ISyndicationLinkFactory_Impl>(size) as Array<ISyndicationLinkFactory?>
  }
}
