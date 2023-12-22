package Windows.Media.MediaProperties

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

@ABIMarker(IH264ProfileIdsStatics.ABI::class)
@Signature("{38654ca7-846a-4f97-a2e5-c3a15bbf70fd}")
@Guid("38654ca7846a4f97a2e5c3a15bbf70fd")
@WinRTInterface("38654ca7846a4f97a2e5c3a15bbf70fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IH264ProfileIdsStatics.ByReference::class)
public interface IH264ProfileIdsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ConstrainedBaseline(): Int

  @InterfaceMethod(1)
  public fun get_Baseline(): Int

  @InterfaceMethod(2)
  public fun get_Extended(): Int

  @InterfaceMethod(3)
  public fun get_Main(): Int

  @InterfaceMethod(4)
  public fun get_High(): Int

  @InterfaceMethod(5)
  public fun get_High10(): Int

  @InterfaceMethod(6)
  public fun get_High422(): Int

  @InterfaceMethod(7)
  public fun get_High444(): Int

  @InterfaceMethod(8)
  public fun get_StereoHigh(): Int

  @InterfaceMethod(9)
  public fun get_MultiviewHigh(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IH264ProfileIdsStatics> {
    public override fun getValue() = ABI.makeIH264ProfileIdsStatics(pointer.getPointer(0))

    public fun setValue(value: IH264ProfileIdsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IH264ProfileIdsStatics {
    public val __1611042137_Ptr: Pointer?

    public val _1611042137_VtblPtr: Pointer?
      get() = __1611042137_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ConstrainedBaseline(): Int {
      val fnPtr = _1611042137_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1611042137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Baseline(): Int {
      val fnPtr = _1611042137_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1611042137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Extended(): Int {
      val fnPtr = _1611042137_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1611042137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Main(): Int {
      val fnPtr = _1611042137_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1611042137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_High(): Int {
      val fnPtr = _1611042137_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1611042137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_High10(): Int {
      val fnPtr = _1611042137_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1611042137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_High422(): Int {
      val fnPtr = _1611042137_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1611042137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_High444(): Int {
      val fnPtr = _1611042137_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1611042137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_StereoHigh(): Int {
      val fnPtr = _1611042137_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1611042137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_MultiviewHigh(): Int {
      val fnPtr = _1611042137_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1611042137_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IH264ProfileIdsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1611042137_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IH264ProfileIdsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38654ca7846a4f97a2e5c3a15bbf70fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIH264ProfileIdsStatics(ptr: Pointer?): WithDefault =
        IH264ProfileIdsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IH264ProfileIdsStatics {
      val address = segment.toRawLongValue()
      return makeIH264ProfileIdsStatics(Pointer(address))
    }

    public override fun toNative(obj: IH264ProfileIdsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1611042137_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IH264ProfileIdsStatics): Array<IH264ProfileIdsStatics?> =
        (elements as
        Array<IH264ProfileIdsStatics?>).castToImpl<IH264ProfileIdsStatics,IH264ProfileIdsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IH264ProfileIdsStatics?> =
        arrayOfNulls<IH264ProfileIdsStatics_Impl>(size) as Array<IH264ProfileIdsStatics?>
  }
}
