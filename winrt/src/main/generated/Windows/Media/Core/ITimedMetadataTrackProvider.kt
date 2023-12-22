package Windows.Media.Core

import Windows.Foundation.Collections.IVectorView
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITimedMetadataTrackProvider.ABI::class)
@Signature("{3b7f2024-f74e-4ade-93c5-219da05b6856}")
@Guid("3b7f2024f74e4ade93c5219da05b6856")
@WinRTInterface("3b7f2024f74e4ade93c5219da05b6856")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedMetadataTrackProvider.ByReference::class)
public interface ITimedMetadataTrackProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TimedMetadataTracks(): IVectorView<TimedMetadataTrack?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedMetadataTrackProvider> {
    public override fun getValue() = ABI.makeITimedMetadataTrackProvider(pointer.getPointer(0))

    public fun setValue(value: ITimedMetadataTrackProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedMetadataTrackProvider {
    public val __1025802507_Ptr: Pointer?

    public val _1025802507_VtblPtr: Pointer?
      get() = __1025802507_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TimedMetadataTracks(): IVectorView<TimedMetadataTrack?>? {
      val fnPtr = _1025802507_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<TimedMetadataTrack?>>()
      val hr = fn.invokeHR(arrayOf(__1025802507_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<TimedMetadataTrack?>>(result.getValue())
      return resultValue
    }
  }

  public class ITimedMetadataTrackProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1025802507_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedMetadataTrackProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b7f2024f74e4ade93c5219da05b6856")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedMetadataTrackProvider(ptr: Pointer?): WithDefault =
        ITimedMetadataTrackProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedMetadataTrackProvider {
      val address = segment.toRawLongValue()
      return makeITimedMetadataTrackProvider(Pointer(address))
    }

    public override fun toNative(obj: ITimedMetadataTrackProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1025802507_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedMetadataTrackProvider):
        Array<ITimedMetadataTrackProvider?> = (elements as
        Array<ITimedMetadataTrackProvider?>).castToImpl<ITimedMetadataTrackProvider,ITimedMetadataTrackProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedMetadataTrackProvider?> =
        arrayOfNulls<ITimedMetadataTrackProvider_Impl>(size) as Array<ITimedMetadataTrackProvider?>
  }
}
