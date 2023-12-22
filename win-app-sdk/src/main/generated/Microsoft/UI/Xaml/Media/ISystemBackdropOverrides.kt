package Microsoft.UI.Xaml.Media

import Microsoft.UI.Composition.ICompositionSupportsSystemBackdrop
import Microsoft.UI.Xaml.XamlRoot
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

@ABIMarker(ISystemBackdropOverrides.ABI::class)
@Signature("{eb1f5399-cad7-5611-b637-09d76a07e708}")
@Guid("eb1f5399cad75611b63709d76a07e708")
@WinRTInterface("eb1f5399cad75611b63709d76a07e708")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemBackdropOverrides.ByReference::class)
public interface ISystemBackdropOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnTargetConnected(connectedTarget: ICompositionSupportsSystemBackdrop?,
      xamlRoot: XamlRoot?): Unit

  @InterfaceMethod(1)
  public fun OnTargetDisconnected(disconnectedTarget: ICompositionSupportsSystemBackdrop?): Unit

  @InterfaceMethod(2)
  public
      fun OnDefaultSystemBackdropConfigurationChanged(target: ICompositionSupportsSystemBackdrop?,
      xamlRoot: XamlRoot?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemBackdropOverrides> {
    public override fun getValue() = ABI.makeISystemBackdropOverrides(pointer.getPointer(0))

    public fun setValue(value: ISystemBackdropOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemBackdropOverrides {
    public val __545458353_Ptr: Pointer?

    public val _545458353_VtblPtr: Pointer?
      get() = __545458353_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnTargetConnected(connectedTarget: ICompositionSupportsSystemBackdrop?,
        xamlRoot: XamlRoot?): Unit {
      val fnPtr = _545458353_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__545458353_Ptr, marshalToNative(connectedTarget),
          marshalToNative(xamlRoot),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override
        fun OnTargetDisconnected(disconnectedTarget: ICompositionSupportsSystemBackdrop?): Unit {
      val fnPtr = _545458353_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__545458353_Ptr, marshalToNative(disconnectedTarget),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun OnDefaultSystemBackdropConfigurationChanged(target: ICompositionSupportsSystemBackdrop?,
        xamlRoot: XamlRoot?): Unit {
      val fnPtr = _545458353_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__545458353_Ptr, marshalToNative(target),
          marshalToNative(xamlRoot),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemBackdropOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __545458353_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemBackdropOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb1f5399cad75611b63709d76a07e708")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemBackdropOverrides(ptr: Pointer?): WithDefault =
        ISystemBackdropOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemBackdropOverrides {
      val address = segment.toRawLongValue()
      return makeISystemBackdropOverrides(Pointer(address))
    }

    public override fun toNative(obj: ISystemBackdropOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__545458353_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemBackdropOverrides):
        Array<ISystemBackdropOverrides?> = (elements as
        Array<ISystemBackdropOverrides?>).castToImpl<ISystemBackdropOverrides,ISystemBackdropOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemBackdropOverrides?> =
        arrayOfNulls<ISystemBackdropOverrides_Impl>(size) as Array<ISystemBackdropOverrides?>
  }
}
