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

@ABIMarker(ISyndicationItemFactory.ABI::class)
@Signature("{251d434f-7db8-487a-85e4-10d191e66ebb}")
@Guid("251d434f7db8487a85e410d191e66ebb")
@WinRTInterface("251d434f7db8487a85e410d191e66ebb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationItemFactory.ByReference::class)
public interface ISyndicationItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSyndicationItem(
    title: String?,
    content: SyndicationContent?,
    uri: Uri?
  ): SyndicationItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationItemFactory> {
    public override fun getValue() = ABI.makeISyndicationItemFactory(pointer.getPointer(0))

    public fun setValue(value: ISyndicationItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationItemFactory {
    public val __791333063_Ptr: Pointer?

    public val _791333063_VtblPtr: Pointer?
      get() = __791333063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSyndicationItem(
      title: String?,
      content: SyndicationContent?,
      uri: Uri?
    ): SyndicationItem? {
      val fnPtr = _791333063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationItem>()
      val hr = fn.invokeHR(arrayOf(__791333063_Ptr, marshalToNative(title),
          marshalToNative(content), marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationItem>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __791333063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("251d434f7db8487a85e410d191e66ebb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationItemFactory(ptr: Pointer?): WithDefault =
        ISyndicationItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationItemFactory {
      val address = segment.toRawLongValue()
      return makeISyndicationItemFactory(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__791333063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationItemFactory): Array<ISyndicationItemFactory?>
        = (elements as
        Array<ISyndicationItemFactory?>).castToImpl<ISyndicationItemFactory,ISyndicationItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationItemFactory?> =
        arrayOfNulls<ISyndicationItemFactory_Impl>(size) as Array<ISyndicationItemFactory?>
  }
}
