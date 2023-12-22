package Windows.Media.Core

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

@ABIMarker(ITimedMetadataTrackFactory.ABI::class)
@Signature("{8dd57611-97b3-4e1f-852c-0f482c81ad26}")
@Guid("8dd5761197b34e1f852c0f482c81ad26")
@WinRTInterface("8dd5761197b34e1f852c0f482c81ad26")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimedMetadataTrackFactory.ByReference::class)
public interface ITimedMetadataTrackFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    id: String?,
    language: String?,
    kind: TimedMetadataKind?
  ): TimedMetadataTrack?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimedMetadataTrackFactory> {
    public override fun getValue() = ABI.makeITimedMetadataTrackFactory(pointer.getPointer(0))

    public fun setValue(value: ITimedMetadataTrackFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimedMetadataTrackFactory {
    public val __1581126992_Ptr: Pointer?

    public val _1581126992_VtblPtr: Pointer?
      get() = __1581126992_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      id: String?,
      language: String?,
      kind: TimedMetadataKind?
    ): TimedMetadataTrack? {
      val fnPtr = _1581126992_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimedMetadataTrack>()
      val hr = fn.invokeHR(arrayOf(__1581126992_Ptr, marshalToNative(id), marshalToNative(language),
          marshalToNative(kind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimedMetadataTrack>(result.getValue())
      return resultValue
    }
  }

  public class ITimedMetadataTrackFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1581126992_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimedMetadataTrackFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8dd5761197b34e1f852c0f482c81ad26")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimedMetadataTrackFactory(ptr: Pointer?): WithDefault =
        ITimedMetadataTrackFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimedMetadataTrackFactory {
      val address = segment.toRawLongValue()
      return makeITimedMetadataTrackFactory(Pointer(address))
    }

    public override fun toNative(obj: ITimedMetadataTrackFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1581126992_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimedMetadataTrackFactory):
        Array<ITimedMetadataTrackFactory?> = (elements as
        Array<ITimedMetadataTrackFactory?>).castToImpl<ITimedMetadataTrackFactory,ITimedMetadataTrackFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimedMetadataTrackFactory?> =
        arrayOfNulls<ITimedMetadataTrackFactory_Impl>(size) as Array<ITimedMetadataTrackFactory?>
  }
}
