package Windows.Media.Protection.PlayReady

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
import kotlin.Byte
import kotlin.Int
import kotlin.Long
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INDClosedCaptionDataReceivedEventArgs.ABI::class)
@Signature("{4738d29f-c345-4649-8468-b8c5fc357190}")
@Guid("4738d29fc34546498468b8c5fc357190")
@WinRTInterface("4738d29fc34546498468b8c5fc357190")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDClosedCaptionDataReceivedEventArgs.ByReference::class)
public interface INDClosedCaptionDataReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClosedCaptionDataFormat(): NDClosedCaptionFormat?

  @InterfaceMethod(1)
  public fun get_PresentationTimestamp(): Long

  @InterfaceMethod(2)
  public fun get_ClosedCaptionData(): Array<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDClosedCaptionDataReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeINDClosedCaptionDataReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INDClosedCaptionDataReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDClosedCaptionDataReceivedEventArgs {
    public val __1723283038_Ptr: Pointer?

    public val _1723283038_VtblPtr: Pointer?
      get() = __1723283038_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClosedCaptionDataFormat(): NDClosedCaptionFormat? {
      val fnPtr = _1723283038_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NDClosedCaptionFormat>()
      val hr = fn.invokeHR(arrayOf(__1723283038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NDClosedCaptionFormat>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PresentationTimestamp(): Long {
      val fnPtr = _1723283038_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__1723283038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ClosedCaptionData(): Array<Byte>? {
      val fnPtr = _1723283038_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__1723283038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class INDClosedCaptionDataReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1723283038_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDClosedCaptionDataReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4738d29fc34546498468b8c5fc357190")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDClosedCaptionDataReceivedEventArgs(ptr: Pointer?): WithDefault =
        INDClosedCaptionDataReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDClosedCaptionDataReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeINDClosedCaptionDataReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INDClosedCaptionDataReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1723283038_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDClosedCaptionDataReceivedEventArgs):
        Array<INDClosedCaptionDataReceivedEventArgs?> = (elements as
        Array<INDClosedCaptionDataReceivedEventArgs?>).castToImpl<INDClosedCaptionDataReceivedEventArgs,INDClosedCaptionDataReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDClosedCaptionDataReceivedEventArgs?> =
        arrayOfNulls<INDClosedCaptionDataReceivedEventArgs_Impl>(size) as
        Array<INDClosedCaptionDataReceivedEventArgs?>
  }
}
