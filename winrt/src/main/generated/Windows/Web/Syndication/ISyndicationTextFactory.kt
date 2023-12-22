package Windows.Web.Syndication

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

@ABIMarker(ISyndicationTextFactory.ABI::class)
@Signature("{ee7342f7-11c6-4b25-ab62-e596bd162946}")
@Guid("ee7342f711c64b25ab62e596bd162946")
@WinRTInterface("ee7342f711c64b25ab62e596bd162946")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationTextFactory.ByReference::class)
public interface ISyndicationTextFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSyndicationText(text: String?): SyndicationText?

  @InterfaceMethod(1)
  public fun CreateSyndicationTextEx(text: String?, type: SyndicationTextType?): SyndicationText?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationTextFactory> {
    public override fun getValue() = ABI.makeISyndicationTextFactory(pointer.getPointer(0))

    public fun setValue(value: ISyndicationTextFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationTextFactory {
    public val __485313901_Ptr: Pointer?

    public val _485313901_VtblPtr: Pointer?
      get() = __485313901_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSyndicationText(text: String?): SyndicationText? {
      val fnPtr = _485313901_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationText>()
      val hr = fn.invokeHR(arrayOf(__485313901_Ptr, marshalToNative(text), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateSyndicationTextEx(text: String?, type: SyndicationTextType?):
        SyndicationText? {
      val fnPtr = _485313901_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SyndicationText>()
      val hr = fn.invokeHR(arrayOf(__485313901_Ptr, marshalToNative(text), marshalToNative(type),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SyndicationText>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationTextFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __485313901_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationTextFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee7342f711c64b25ab62e596bd162946")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationTextFactory(ptr: Pointer?): WithDefault =
        ISyndicationTextFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationTextFactory {
      val address = segment.toRawLongValue()
      return makeISyndicationTextFactory(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationTextFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__485313901_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationTextFactory): Array<ISyndicationTextFactory?>
        = (elements as
        Array<ISyndicationTextFactory?>).castToImpl<ISyndicationTextFactory,ISyndicationTextFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationTextFactory?> =
        arrayOfNulls<ISyndicationTextFactory_Impl>(size) as Array<ISyndicationTextFactory?>
  }
}
