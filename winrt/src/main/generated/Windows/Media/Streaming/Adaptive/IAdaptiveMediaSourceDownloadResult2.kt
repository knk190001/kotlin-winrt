package Windows.Media.Streaming.Adaptive

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdaptiveMediaSourceDownloadResult2.ABI::class)
@Signature("{15552cb7-7b80-4ac4-8660-a4b97f7c70f0}")
@Guid("15552cb77b804ac48660a4b97f7c70f0")
@WinRTInterface("15552cb77b804ac48660a4b97f7c70f0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDownloadResult2.ByReference::class)
public interface IAdaptiveMediaSourceDownloadResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResourceByteRangeOffset(): IReference<WinDef.ULONG>?

  @InterfaceMethod(1)
  public fun put_ResourceByteRangeOffset(value: IReference<WinDef.ULONG>?): Unit

  @InterfaceMethod(2)
  public fun get_ResourceByteRangeLength(): IReference<WinDef.ULONG>?

  @InterfaceMethod(3)
  public fun put_ResourceByteRangeLength(value: IReference<WinDef.ULONG>?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDownloadResult2> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDownloadResult2(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDownloadResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDownloadResult2 {
    public val __31663498_Ptr: Pointer?

    public val _31663498_VtblPtr: Pointer?
      get() = __31663498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResourceByteRangeOffset(): IReference<WinDef.ULONG>? {
      val fnPtr = _31663498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__31663498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ResourceByteRangeOffset(value: IReference<WinDef.ULONG>?): Unit {
      val fnPtr = _31663498_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__31663498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ResourceByteRangeLength(): IReference<WinDef.ULONG>? {
      val fnPtr = _31663498_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.ULONG>>()
      val hr = fn.invokeHR(arrayOf(__31663498_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.ULONG>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ResourceByteRangeLength(value: IReference<WinDef.ULONG>?): Unit {
      val fnPtr = _31663498_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__31663498_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAdaptiveMediaSourceDownloadResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __31663498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDownloadResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("15552cb77b804ac48660a4b97f7c70f0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDownloadResult2(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDownloadResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdaptiveMediaSourceDownloadResult2 {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDownloadResult2(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDownloadResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__31663498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDownloadResult2):
        Array<IAdaptiveMediaSourceDownloadResult2?> = (elements as
        Array<IAdaptiveMediaSourceDownloadResult2?>).castToImpl<IAdaptiveMediaSourceDownloadResult2,IAdaptiveMediaSourceDownloadResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdaptiveMediaSourceDownloadResult2?> =
        arrayOfNulls<IAdaptiveMediaSourceDownloadResult2_Impl>(size) as
        Array<IAdaptiveMediaSourceDownloadResult2?>
  }
}
