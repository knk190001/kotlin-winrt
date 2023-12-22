package Windows.UI.Input.Core

import Windows.UI.Core.CoreDispatcher
import Windows.UI.Input.RadialController
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

@ABIMarker(IRadialControllerIndependentInputSource.ABI::class)
@Signature("{3d577ef6-4cee-11e6-b535-001bdc06ab3b}")
@Guid("3d577ef64cee11e6b535001bdc06ab3b")
@WinRTInterface("3d577ef64cee11e6b535001bdc06ab3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialControllerIndependentInputSource.ByReference::class)
public interface IRadialControllerIndependentInputSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Controller(): RadialController?

  @InterfaceMethod(1)
  public fun get_Dispatcher(): CoreDispatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialControllerIndependentInputSource> {
    public override fun getValue() =
        ABI.makeIRadialControllerIndependentInputSource(pointer.getPointer(0))

    public fun setValue(value: IRadialControllerIndependentInputSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialControllerIndependentInputSource {
    public val __1187695677_Ptr: Pointer?

    public val _1187695677_VtblPtr: Pointer?
      get() = __1187695677_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Controller(): RadialController? {
      val fnPtr = _1187695677_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RadialController>()
      val hr = fn.invokeHR(arrayOf(__1187695677_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RadialController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Dispatcher(): CoreDispatcher? {
      val fnPtr = _1187695677_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreDispatcher>()
      val hr = fn.invokeHR(arrayOf(__1187695677_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreDispatcher>(result.getValue())
      return resultValue
    }
  }

  public class IRadialControllerIndependentInputSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187695677_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialControllerIndependentInputSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d577ef64cee11e6b535001bdc06ab3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialControllerIndependentInputSource(ptr: Pointer?): WithDefault =
        IRadialControllerIndependentInputSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRadialControllerIndependentInputSource {
      val address = segment.toRawLongValue()
      return makeIRadialControllerIndependentInputSource(Pointer(address))
    }

    public override fun toNative(obj: IRadialControllerIndependentInputSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187695677_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialControllerIndependentInputSource):
        Array<IRadialControllerIndependentInputSource?> = (elements as
        Array<IRadialControllerIndependentInputSource?>).castToImpl<IRadialControllerIndependentInputSource,IRadialControllerIndependentInputSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialControllerIndependentInputSource?> =
        arrayOfNulls<IRadialControllerIndependentInputSource_Impl>(size) as
        Array<IRadialControllerIndependentInputSource?>
  }
}
