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

@ABIMarker(ISyndicationFeedFactory.ABI::class)
@Signature("{23472232-8be9-48b7-8934-6205131d9357}")
@Guid("234722328be948b789346205131d9357")
@WinRTInterface("234722328be948b789346205131d9357")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationFeedFactory.ByReference::class)
public interface ISyndicationFeedFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSyndicationFeed(
    title: String?,
    subtitle: String?,
    uri: Uri?
  ): SyndicationFeed?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationFeedFactory> {
    public override fun getValue() = ABI.makeISyndicationFeedFactory(pointer.getPointer(0))

    public fun setValue(value: ISyndicationFeedFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationFeedFactory {
    public val __2034531292_Ptr: Pointer?

    public val _2034531292_VtblPtr: Pointer?
      get() = __2034531292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSyndicationFeed(
      title: String?,
      subtitle: String?,
      uri: Uri?
    ): SyndicationFeed? {
      val fnPtr = _2034531292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationFeed>()
      val hr = fn.invokeHR(arrayOf(__2034531292_Ptr, marshalToNative(title),
          marshalToNative(subtitle), marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationFeed>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationFeedFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2034531292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationFeedFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("234722328be948b789346205131d9357")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationFeedFactory(ptr: Pointer?): WithDefault =
        ISyndicationFeedFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationFeedFactory {
      val address = segment.toRawLongValue()
      return makeISyndicationFeedFactory(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationFeedFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2034531292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationFeedFactory): Array<ISyndicationFeedFactory?>
        = (elements as
        Array<ISyndicationFeedFactory?>).castToImpl<ISyndicationFeedFactory,ISyndicationFeedFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationFeedFactory?> =
        arrayOfNulls<ISyndicationFeedFactory_Impl>(size) as Array<ISyndicationFeedFactory?>
  }
}
