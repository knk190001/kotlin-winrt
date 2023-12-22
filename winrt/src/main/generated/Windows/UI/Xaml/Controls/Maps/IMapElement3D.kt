package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Numerics.Vector3
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapElement3D.ABI::class)
@Signature("{827af8d5-3843-48e2-bd00-0f0644fbe6a5}")
@Guid("827af8d5384348e2bd000f0644fbe6a5")
@WinRTInterface("827af8d5384348e2bd000f0644fbe6a5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapElement3D.ByReference::class)
public interface IMapElement3D : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Location(): Geopoint?

  @InterfaceMethod(1)
  public fun put_Location(value: Geopoint?): Unit

  @InterfaceMethod(2)
  public fun get_Model(): MapModel3D?

  @InterfaceMethod(3)
  public fun put_Model(value: MapModel3D?): Unit

  @InterfaceMethod(4)
  public fun get_Heading(): Double

  @InterfaceMethod(5)
  public fun put_Heading(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_Pitch(): Double

  @InterfaceMethod(7)
  public fun put_Pitch(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_Roll(): Double

  @InterfaceMethod(9)
  public fun put_Roll(value: Double): Unit

  @InterfaceMethod(10)
  public fun get_Scale(): Vector3?

  @InterfaceMethod(11)
  public fun put_Scale(value: Vector3?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapElement3D>
      {
    public override fun getValue() = ABI.makeIMapElement3D(pointer.getPointer(0))

    public fun setValue(value: IMapElement3D_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapElement3D {
    public val __907152318_Ptr: Pointer?

    public val _907152318_VtblPtr: Pointer?
      get() = __907152318_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _907152318_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Location(value: Geopoint?): Unit {
      val fnPtr = _907152318_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Model(): MapModel3D? {
      val fnPtr = _907152318_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapModel3D>()
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapModel3D>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Model(value: MapModel3D?): Unit {
      val fnPtr = _907152318_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Heading(): Double {
      val fnPtr = _907152318_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_Heading(value: Double): Unit {
      val fnPtr = _907152318_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Pitch(): Double {
      val fnPtr = _907152318_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Pitch(value: Double): Unit {
      val fnPtr = _907152318_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Roll(): Double {
      val fnPtr = _907152318_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_Roll(value: Double): Unit {
      val fnPtr = _907152318_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Scale(): Vector3? {
      val fnPtr = _907152318_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Scale(value: Vector3?): Unit {
      val fnPtr = _907152318_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__907152318_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapElement3D_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __907152318_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapElement3D, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("827af8d5384348e2bd000f0644fbe6a5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapElement3D(ptr: Pointer?): WithDefault = IMapElement3D_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapElement3D {
      val address = segment.toRawLongValue()
      return makeIMapElement3D(Pointer(address))
    }

    public override fun toNative(obj: IMapElement3D): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__907152318_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapElement3D): Array<IMapElement3D?> = (elements as
        Array<IMapElement3D?>).castToImpl<IMapElement3D,IMapElement3D_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapElement3D?> =
        arrayOfNulls<IMapElement3D_Impl>(size) as Array<IMapElement3D?>
  }
}
