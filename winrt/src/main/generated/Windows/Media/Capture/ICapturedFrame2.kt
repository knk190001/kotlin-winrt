package Windows.Media.Capture

import Windows.Graphics.Imaging.BitmapPropertySet
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

@ABIMarker(ICapturedFrame2.ABI::class)
@Signature("{543fa6d1-bd78-4866-adda-24314bc65dea}")
@Guid("543fa6d1bd784866adda24314bc65dea")
@WinRTInterface("543fa6d1bd784866adda24314bc65dea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICapturedFrame2.ByReference::class)
public interface ICapturedFrame2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ControlValues(): CapturedFrameControlValues?

  @InterfaceMethod(1)
  public fun get_BitmapProperties(): BitmapPropertySet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICapturedFrame2> {
    public override fun getValue() = ABI.makeICapturedFrame2(pointer.getPointer(0))

    public fun setValue(value: ICapturedFrame2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICapturedFrame2 {
    public val __1855126971_Ptr: Pointer?

    public val _1855126971_VtblPtr: Pointer?
      get() = __1855126971_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ControlValues(): CapturedFrameControlValues? {
      val fnPtr = _1855126971_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CapturedFrameControlValues>()
      val hr = fn.invokeHR(arrayOf(__1855126971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CapturedFrameControlValues>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BitmapProperties(): BitmapPropertySet? {
      val fnPtr = _1855126971_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapPropertySet>()
      val hr = fn.invokeHR(arrayOf(__1855126971_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapPropertySet>(result.getValue())
      return resultValue
    }
  }

  public class ICapturedFrame2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1855126971_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICapturedFrame2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("543fa6d1bd784866adda24314bc65dea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICapturedFrame2(ptr: Pointer?): WithDefault = ICapturedFrame2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICapturedFrame2 {
      val address = segment.toRawLongValue()
      return makeICapturedFrame2(Pointer(address))
    }

    public override fun toNative(obj: ICapturedFrame2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1855126971_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICapturedFrame2): Array<ICapturedFrame2?> = (elements as
        Array<ICapturedFrame2?>).castToImpl<ICapturedFrame2,ICapturedFrame2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICapturedFrame2?> =
        arrayOfNulls<ICapturedFrame2_Impl>(size) as Array<ICapturedFrame2?>
  }
}
