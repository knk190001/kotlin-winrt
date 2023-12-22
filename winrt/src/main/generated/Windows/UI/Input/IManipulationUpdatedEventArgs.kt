package Windows.UI.Input

import Windows.Devices.Input.PointerDeviceType
import Windows.Foundation.Point
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

@ABIMarker(IManipulationUpdatedEventArgs.ABI::class)
@Signature("{cb354ce5-abb8-4f9f-b3ce-8181aa61ad82}")
@Guid("cb354ce5abb84f9fb3ce8181aa61ad82")
@WinRTInterface("cb354ce5abb84f9fb3ce8181aa61ad82")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationUpdatedEventArgs.ByReference::class)
public interface IManipulationUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(1)
  public fun get_Position(): Point?

  @InterfaceMethod(2)
  public fun get_Delta(): ManipulationDelta?

  @InterfaceMethod(3)
  public fun get_Cumulative(): ManipulationDelta?

  @InterfaceMethod(4)
  public fun get_Velocities(): ManipulationVelocities?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationUpdatedEventArgs> {
    public override fun getValue() = ABI.makeIManipulationUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IManipulationUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationUpdatedEventArgs {
    public val __104672679_Ptr: Pointer?

    public val _104672679_VtblPtr: Pointer?
      get() = __104672679_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _104672679_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__104672679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Position(): Point? {
      val fnPtr = _104672679_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__104672679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Delta(): ManipulationDelta? {
      val fnPtr = _104672679_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__104672679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationDelta>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Cumulative(): ManipulationDelta? {
      val fnPtr = _104672679_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationDelta>()
      val hr = fn.invokeHR(arrayOf(__104672679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationDelta>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Velocities(): ManipulationVelocities? {
      val fnPtr = _104672679_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationVelocities>()
      val hr = fn.invokeHR(arrayOf(__104672679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationVelocities>(result.getValue())
      return resultValue
    }
  }

  public class IManipulationUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __104672679_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb354ce5abb84f9fb3ce8181aa61ad82")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationUpdatedEventArgs(ptr: Pointer?): WithDefault =
        IManipulationUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IManipulationUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIManipulationUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IManipulationUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__104672679_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationUpdatedEventArgs):
        Array<IManipulationUpdatedEventArgs?> = (elements as
        Array<IManipulationUpdatedEventArgs?>).castToImpl<IManipulationUpdatedEventArgs,IManipulationUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationUpdatedEventArgs?> =
        arrayOfNulls<IManipulationUpdatedEventArgs_Impl>(size) as
        Array<IManipulationUpdatedEventArgs?>
  }
}
