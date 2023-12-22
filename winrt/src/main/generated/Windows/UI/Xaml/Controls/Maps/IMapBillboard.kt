package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Point
import Windows.Storage.Streams.IRandomAccessStreamReference
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

@ABIMarker(IMapBillboard.ABI::class)
@Signature("{1694259d-0ae2-4f42-a02e-292ca835d39d}")
@Guid("1694259d0ae24f42a02e292ca835d39d")
@WinRTInterface("1694259d0ae24f42a02e292ca835d39d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapBillboard.ByReference::class)
public interface IMapBillboard : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Location(): Geopoint?

  @InterfaceMethod(1)
  public fun put_Location(value: Geopoint?): Unit

  @InterfaceMethod(2)
  public fun get_NormalizedAnchorPoint(): Point?

  @InterfaceMethod(3)
  public fun put_NormalizedAnchorPoint(value: Point?): Unit

  @InterfaceMethod(4)
  public fun get_Image(): IRandomAccessStreamReference?

  @InterfaceMethod(5)
  public fun put_Image(value: IRandomAccessStreamReference?): Unit

  @InterfaceMethod(6)
  public fun get_CollisionBehaviorDesired(): MapElementCollisionBehavior?

  @InterfaceMethod(7)
  public fun put_CollisionBehaviorDesired(value: MapElementCollisionBehavior?): Unit

  @InterfaceMethod(8)
  public fun get_ReferenceCamera(): MapCamera?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapBillboard>
      {
    public override fun getValue() = ABI.makeIMapBillboard(pointer.getPointer(0))

    public fun setValue(value: IMapBillboard_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapBillboard {
    public val __1172952340_Ptr: Pointer?

    public val _1172952340_VtblPtr: Pointer?
      get() = __1172952340_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _1172952340_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1172952340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Location(value: Geopoint?): Unit {
      val fnPtr = _1172952340_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1172952340_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_NormalizedAnchorPoint(): Point? {
      val fnPtr = _1172952340_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1172952340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_NormalizedAnchorPoint(value: Point?): Unit {
      val fnPtr = _1172952340_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1172952340_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Image(): IRandomAccessStreamReference? {
      val fnPtr = _1172952340_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1172952340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Image(value: IRandomAccessStreamReference?): Unit {
      val fnPtr = _1172952340_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1172952340_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CollisionBehaviorDesired(): MapElementCollisionBehavior? {
      val fnPtr = _1172952340_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapElementCollisionBehavior>()
      val hr = fn.invokeHR(arrayOf(__1172952340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapElementCollisionBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CollisionBehaviorDesired(value: MapElementCollisionBehavior?): Unit {
      val fnPtr = _1172952340_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1172952340_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ReferenceCamera(): MapCamera? {
      val fnPtr = _1172952340_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCamera>()
      val hr = fn.invokeHR(arrayOf(__1172952340_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCamera>(result.getValue())
      return resultValue
    }
  }

  public class IMapBillboard_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1172952340_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapBillboard, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1694259d0ae24f42a02e292ca835d39d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapBillboard(ptr: Pointer?): WithDefault = IMapBillboard_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapBillboard {
      val address = segment.toRawLongValue()
      return makeIMapBillboard(Pointer(address))
    }

    public override fun toNative(obj: IMapBillboard): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1172952340_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapBillboard): Array<IMapBillboard?> = (elements as
        Array<IMapBillboard?>).castToImpl<IMapBillboard,IMapBillboard_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapBillboard?> =
        arrayOfNulls<IMapBillboard_Impl>(size) as Array<IMapBillboard?>
  }
}
