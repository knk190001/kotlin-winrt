package Windows.Media.Capture

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IAppBroadcastPlugInManager.ABI::class)
@Signature("{e550d979-27a1-49a7-bbf4-d7a9e9d07668}")
@Guid("e550d97927a149a7bbf4d7a9e9d07668")
@WinRTInterface("e550d97927a149a7bbf4d7a9e9d07668")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBroadcastPlugInManager.ByReference::class)
public interface IAppBroadcastPlugInManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsBroadcastProviderAvailable(): Boolean

  @InterfaceMethod(1)
  public fun get_PlugInList(): IVectorView<AppBroadcastPlugIn?>?

  @InterfaceMethod(2)
  public fun get_DefaultPlugIn(): AppBroadcastPlugIn?

  @InterfaceMethod(3)
  public fun put_DefaultPlugIn(value: AppBroadcastPlugIn?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBroadcastPlugInManager> {
    public override fun getValue() = ABI.makeIAppBroadcastPlugInManager(pointer.getPointer(0))

    public fun setValue(value: IAppBroadcastPlugInManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBroadcastPlugInManager {
    public val __1568946242_Ptr: Pointer?

    public val _1568946242_VtblPtr: Pointer?
      get() = __1568946242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsBroadcastProviderAvailable(): Boolean {
      val fnPtr = _1568946242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1568946242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_PlugInList(): IVectorView<AppBroadcastPlugIn?>? {
      val fnPtr = _1568946242_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AppBroadcastPlugIn?>>()
      val hr = fn.invokeHR(arrayOf(__1568946242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AppBroadcastPlugIn?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DefaultPlugIn(): AppBroadcastPlugIn? {
      val fnPtr = _1568946242_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBroadcastPlugIn>()
      val hr = fn.invokeHR(arrayOf(__1568946242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBroadcastPlugIn>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_DefaultPlugIn(value: AppBroadcastPlugIn?): Unit {
      val fnPtr = _1568946242_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1568946242_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBroadcastPlugInManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1568946242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBroadcastPlugInManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e550d97927a149a7bbf4d7a9e9d07668")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBroadcastPlugInManager(ptr: Pointer?): WithDefault =
        IAppBroadcastPlugInManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBroadcastPlugInManager {
      val address = segment.toRawLongValue()
      return makeIAppBroadcastPlugInManager(Pointer(address))
    }

    public override fun toNative(obj: IAppBroadcastPlugInManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1568946242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBroadcastPlugInManager):
        Array<IAppBroadcastPlugInManager?> = (elements as
        Array<IAppBroadcastPlugInManager?>).castToImpl<IAppBroadcastPlugInManager,IAppBroadcastPlugInManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBroadcastPlugInManager?> =
        arrayOfNulls<IAppBroadcastPlugInManager_Impl>(size) as Array<IAppBroadcastPlugInManager?>
  }
}
