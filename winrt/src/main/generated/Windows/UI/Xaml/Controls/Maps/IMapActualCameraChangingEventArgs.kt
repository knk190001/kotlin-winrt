package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapActualCameraChangingEventArgs.ABI::class)
@Signature("{6b0dbed6-93f7-4682-8de5-a47a1cc7a945}")
@Guid("6b0dbed693f746828de5a47a1cc7a945")
@WinRTInterface("6b0dbed693f746828de5a47a1cc7a945")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapActualCameraChangingEventArgs.ByReference::class)
public interface IMapActualCameraChangingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Camera(): MapCamera?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapActualCameraChangingEventArgs> {
    public override fun getValue() =
        ABI.makeIMapActualCameraChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapActualCameraChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapActualCameraChangingEventArgs {
    public val __99015660_Ptr: Pointer?

    public val _99015660_VtblPtr: Pointer?
      get() = __99015660_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Camera(): MapCamera? {
      val fnPtr = _99015660_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCamera>()
      val hr = fn.invokeHR(arrayOf(__99015660_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCamera>(result.getValue())
      return resultValue
    }
  }

  public class IMapActualCameraChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __99015660_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapActualCameraChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b0dbed693f746828de5a47a1cc7a945")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapActualCameraChangingEventArgs(ptr: Pointer?): WithDefault =
        IMapActualCameraChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapActualCameraChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapActualCameraChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapActualCameraChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__99015660_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapActualCameraChangingEventArgs):
        Array<IMapActualCameraChangingEventArgs?> = (elements as
        Array<IMapActualCameraChangingEventArgs?>).castToImpl<IMapActualCameraChangingEventArgs,IMapActualCameraChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapActualCameraChangingEventArgs?> =
        arrayOfNulls<IMapActualCameraChangingEventArgs_Impl>(size) as
        Array<IMapActualCameraChangingEventArgs?>
  }
}
