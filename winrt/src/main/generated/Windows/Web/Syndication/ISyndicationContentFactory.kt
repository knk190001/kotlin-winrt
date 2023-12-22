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

@ABIMarker(ISyndicationContentFactory.ABI::class)
@Signature("{3d2fbb93-9520-4173-9388-7e2df324a8a0}")
@Guid("3d2fbb939520417393887e2df324a8a0")
@WinRTInterface("3d2fbb939520417393887e2df324a8a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationContentFactory.ByReference::class)
public interface ISyndicationContentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSyndicationContent(text: String?, type: SyndicationTextType?):
      SyndicationContent?

  @InterfaceMethod(1)
  public fun CreateSyndicationContentWithSourceUri(sourceUri: Uri?): SyndicationContent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationContentFactory> {
    public override fun getValue() = ABI.makeISyndicationContentFactory(pointer.getPointer(0))

    public fun setValue(value: ISyndicationContentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationContentFactory {
    public val __1345035775_Ptr: Pointer?

    public val _1345035775_VtblPtr: Pointer?
      get() = __1345035775_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSyndicationContent(text: String?, type: SyndicationTextType?):
        SyndicationContent? {
      val fnPtr = _1345035775_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationContent>()
      val hr = fn.invokeHR(arrayOf(__1345035775_Ptr, marshalToNative(text), marshalToNative(type),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateSyndicationContentWithSourceUri(sourceUri: Uri?):
        SyndicationContent? {
      val fnPtr = _1345035775_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationContent>()
      val hr = fn.invokeHR(arrayOf(__1345035775_Ptr, marshalToNative(sourceUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationContent>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationContentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1345035775_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationContentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d2fbb939520417393887e2df324a8a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationContentFactory(ptr: Pointer?): WithDefault =
        ISyndicationContentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationContentFactory {
      val address = segment.toRawLongValue()
      return makeISyndicationContentFactory(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationContentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1345035775_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationContentFactory):
        Array<ISyndicationContentFactory?> = (elements as
        Array<ISyndicationContentFactory?>).castToImpl<ISyndicationContentFactory,ISyndicationContentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationContentFactory?> =
        arrayOfNulls<ISyndicationContentFactory_Impl>(size) as Array<ISyndicationContentFactory?>
  }
}
