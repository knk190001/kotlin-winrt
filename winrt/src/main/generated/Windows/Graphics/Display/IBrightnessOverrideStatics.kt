package Windows.Graphics.Display

import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBrightnessOverrideStatics.ABI::class)
@Signature("{03a7b9ed-e1f1-4a68-a11f-946ad8ce5393}")
@Guid("03a7b9ede1f14a68a11f946ad8ce5393")
@WinRTInterface("03a7b9ede1f14a68a11f946ad8ce5393")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBrightnessOverrideStatics.ByReference::class)
public interface IBrightnessOverrideStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultForSystem(): BrightnessOverride?

  @InterfaceMethod(1)
  public fun GetForCurrentView(): BrightnessOverride?

  @InterfaceMethod(2)
  public fun SaveForSystemAsync(value: BrightnessOverride?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBrightnessOverrideStatics> {
    public override fun getValue() = ABI.makeIBrightnessOverrideStatics(pointer.getPointer(0))

    public fun setValue(value: IBrightnessOverrideStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBrightnessOverrideStatics {
    public val __2041285001_Ptr: Pointer?

    public val _2041285001_VtblPtr: Pointer?
      get() = __2041285001_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultForSystem(): BrightnessOverride? {
      val fnPtr = _2041285001_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrightnessOverride>()
      val hr = fn.invokeHR(arrayOf(__2041285001_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrightnessOverride>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForCurrentView(): BrightnessOverride? {
      val fnPtr = _2041285001_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrightnessOverride>()
      val hr = fn.invokeHR(arrayOf(__2041285001_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrightnessOverride>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SaveForSystemAsync(value: BrightnessOverride?): IAsyncOperation<Boolean>? {
      val fnPtr = _2041285001_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2041285001_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IBrightnessOverrideStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2041285001_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBrightnessOverrideStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03a7b9ede1f14a68a11f946ad8ce5393")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBrightnessOverrideStatics(ptr: Pointer?): WithDefault =
        IBrightnessOverrideStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBrightnessOverrideStatics {
      val address = segment.toRawLongValue()
      return makeIBrightnessOverrideStatics(Pointer(address))
    }

    public override fun toNative(obj: IBrightnessOverrideStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2041285001_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBrightnessOverrideStatics):
        Array<IBrightnessOverrideStatics?> = (elements as
        Array<IBrightnessOverrideStatics?>).castToImpl<IBrightnessOverrideStatics,IBrightnessOverrideStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBrightnessOverrideStatics?> =
        arrayOfNulls<IBrightnessOverrideStatics_Impl>(size) as Array<IBrightnessOverrideStatics?>
  }
}
