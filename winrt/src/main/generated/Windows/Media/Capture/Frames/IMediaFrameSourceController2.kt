package Windows.Media.Capture.Frames

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IReference
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaFrameSourceController2.ABI::class)
@Signature("{efc49fd4-fcf2-4a03-b4e4-ac9628739bee}")
@Guid("efc49fd4fcf24a03b4e4ac9628739bee")
@WinRTInterface("efc49fd4fcf24a03b4e4ac9628739bee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameSourceController2.ByReference::class)
public interface IMediaFrameSourceController2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPropertyByExtendedIdAsync(extendedPropertyId: Array<Byte>,
      maxPropertyValueSize: IReference<WinDef.UINT>?):
      IAsyncOperation<MediaFrameSourceGetPropertyResult?>?

  @InterfaceMethod(1)
  public fun SetPropertyByExtendedIdAsync(extendedPropertyId: Array<Byte>,
      propertyValue: Array<Byte>): IAsyncOperation<MediaFrameSourceSetPropertyStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameSourceController2> {
    public override fun getValue() = ABI.makeIMediaFrameSourceController2(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameSourceController2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameSourceController2 {
    public val __539491884_Ptr: Pointer?

    public val _539491884_VtblPtr: Pointer?
      get() = __539491884_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPropertyByExtendedIdAsync(extendedPropertyId: Array<Byte>,
        maxPropertyValueSize: IReference<WinDef.UINT>?):
        IAsyncOperation<MediaFrameSourceGetPropertyResult?>? {
      val fnPtr = _539491884_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaFrameSourceGetPropertyResult?>>()
      val hr = fn.invokeHR(arrayOf(__539491884_Ptr,
          extendedPropertyId.size,marshalToNative(extendedPropertyId),
          marshalToNative(maxPropertyValueSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MediaFrameSourceGetPropertyResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetPropertyByExtendedIdAsync(extendedPropertyId: Array<Byte>,
        propertyValue: Array<Byte>): IAsyncOperation<MediaFrameSourceSetPropertyStatus?>? {
      val fnPtr = _539491884_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaFrameSourceSetPropertyStatus?>>()
      val hr = fn.invokeHR(arrayOf(__539491884_Ptr,
          extendedPropertyId.size,marshalToNative(extendedPropertyId),
          propertyValue.size,marshalToNative(propertyValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MediaFrameSourceSetPropertyStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameSourceController2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __539491884_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameSourceController2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efc49fd4fcf24a03b4e4ac9628739bee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameSourceController2(ptr: Pointer?): WithDefault =
        IMediaFrameSourceController2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameSourceController2 {
      val address = segment.toRawLongValue()
      return makeIMediaFrameSourceController2(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameSourceController2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__539491884_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameSourceController2):
        Array<IMediaFrameSourceController2?> = (elements as
        Array<IMediaFrameSourceController2?>).castToImpl<IMediaFrameSourceController2,IMediaFrameSourceController2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameSourceController2?> =
        arrayOfNulls<IMediaFrameSourceController2_Impl>(size) as
        Array<IMediaFrameSourceController2?>
  }
}
