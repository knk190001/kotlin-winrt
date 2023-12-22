package Microsoft.UI.Content

import Microsoft.UI.Composition.Compositor
import Microsoft.UI.WindowId
import Windows.UI.Composition.ContainerVisual
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

@ABIMarker(ISystemVisualSiteBridgeStatics.ABI::class)
@Signature("{f37ddb4c-8b68-5eb6-bdee-31256973f42d}")
@Guid("f37ddb4c8b685eb6bdee31256973f42d")
@WinRTInterface("f37ddb4c8b685eb6bdee31256973f42d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemVisualSiteBridgeStatics.ByReference::class)
public interface ISystemVisualSiteBridgeStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    localCompositor: Compositor?,
    hostVisual: ContainerVisual?,
    parentForInputWindowId: WindowId?
  ): SystemVisualSiteBridge?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemVisualSiteBridgeStatics> {
    public override fun getValue() = ABI.makeISystemVisualSiteBridgeStatics(pointer.getPointer(0))

    public fun setValue(value: ISystemVisualSiteBridgeStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemVisualSiteBridgeStatics {
    public val __1068611204_Ptr: Pointer?

    public val _1068611204_VtblPtr: Pointer?
      get() = __1068611204_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      localCompositor: Compositor?,
      hostVisual: ContainerVisual?,
      parentForInputWindowId: WindowId?
    ): SystemVisualSiteBridge? {
      val fnPtr = _1068611204_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SystemVisualSiteBridge>()
      val hr = fn.invokeHR(arrayOf(__1068611204_Ptr, marshalToNative(localCompositor),
          marshalToNative(hostVisual), marshalToNative(parentForInputWindowId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SystemVisualSiteBridge>(result.getValue())
      return resultValue
    }
  }

  public class ISystemVisualSiteBridgeStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1068611204_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemVisualSiteBridgeStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f37ddb4c8b685eb6bdee31256973f42d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemVisualSiteBridgeStatics(ptr: Pointer?): WithDefault =
        ISystemVisualSiteBridgeStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemVisualSiteBridgeStatics {
      val address = segment.toRawLongValue()
      return makeISystemVisualSiteBridgeStatics(Pointer(address))
    }

    public override fun toNative(obj: ISystemVisualSiteBridgeStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1068611204_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemVisualSiteBridgeStatics):
        Array<ISystemVisualSiteBridgeStatics?> = (elements as
        Array<ISystemVisualSiteBridgeStatics?>).castToImpl<ISystemVisualSiteBridgeStatics,ISystemVisualSiteBridgeStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemVisualSiteBridgeStatics?> =
        arrayOfNulls<ISystemVisualSiteBridgeStatics_Impl>(size) as
        Array<ISystemVisualSiteBridgeStatics?>
  }
}
