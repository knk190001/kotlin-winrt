package Windows.Devices.Lights.Effects

import Windows.Foundation.TimeSpan
import Windows.Graphics.Imaging.SoftwareBitmap
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

@ABIMarker(ILampArrayBitmapRequestedEventArgs.ABI::class)
@Signature("{c8b4af9e-fe63-4d51-babd-619defb454ba}")
@Guid("c8b4af9efe634d51babd619defb454ba")
@WinRTInterface("c8b4af9efe634d51babd619defb454ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILampArrayBitmapRequestedEventArgs.ByReference::class)
public interface ILampArrayBitmapRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SinceStarted(): TimeSpan?

  @InterfaceMethod(1)
  public fun UpdateBitmap(bitmap: SoftwareBitmap?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILampArrayBitmapRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeILampArrayBitmapRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ILampArrayBitmapRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILampArrayBitmapRequestedEventArgs {
    public val __1950246979_Ptr: Pointer?

    public val _1950246979_VtblPtr: Pointer?
      get() = __1950246979_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SinceStarted(): TimeSpan? {
      val fnPtr = _1950246979_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1950246979_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UpdateBitmap(bitmap: SoftwareBitmap?): Unit {
      val fnPtr = _1950246979_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1950246979_Ptr, marshalToNative(bitmap),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILampArrayBitmapRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1950246979_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILampArrayBitmapRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c8b4af9efe634d51babd619defb454ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILampArrayBitmapRequestedEventArgs(ptr: Pointer?): WithDefault =
        ILampArrayBitmapRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILampArrayBitmapRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeILampArrayBitmapRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ILampArrayBitmapRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1950246979_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILampArrayBitmapRequestedEventArgs):
        Array<ILampArrayBitmapRequestedEventArgs?> = (elements as
        Array<ILampArrayBitmapRequestedEventArgs?>).castToImpl<ILampArrayBitmapRequestedEventArgs,ILampArrayBitmapRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILampArrayBitmapRequestedEventArgs?> =
        arrayOfNulls<ILampArrayBitmapRequestedEventArgs_Impl>(size) as
        Array<ILampArrayBitmapRequestedEventArgs?>
  }
}
