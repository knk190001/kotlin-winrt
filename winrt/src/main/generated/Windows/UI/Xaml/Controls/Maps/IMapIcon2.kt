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

@ABIMarker(IMapIcon2.ABI::class)
@Signature("{611254b9-d8aa-4bbd-a316-badf06911d63}")
@Guid("611254b9d8aa4bbda316badf06911d63")
@WinRTInterface("611254b9d8aa4bbda316badf06911d63")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapIcon2.ByReference::class)
public interface IMapIcon2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CollisionBehaviorDesired(): MapElementCollisionBehavior?

  @InterfaceMethod(1)
  public fun put_CollisionBehaviorDesired(value: MapElementCollisionBehavior?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapIcon2> {
    public override fun getValue() = ABI.makeIMapIcon2(pointer.getPointer(0))

    public fun setValue(value: IMapIcon2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapIcon2 {
    public val __1350098130_Ptr: Pointer?

    public val _1350098130_VtblPtr: Pointer?
      get() = __1350098130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CollisionBehaviorDesired(): MapElementCollisionBehavior? {
      val fnPtr = _1350098130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapElementCollisionBehavior>()
      val hr = fn.invokeHR(arrayOf(__1350098130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapElementCollisionBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CollisionBehaviorDesired(value: MapElementCollisionBehavior?): Unit {
      val fnPtr = _1350098130_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1350098130_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapIcon2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1350098130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapIcon2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("611254b9d8aa4bbda316badf06911d63")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapIcon2(ptr: Pointer?): WithDefault = IMapIcon2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapIcon2 {
      val address = segment.toRawLongValue()
      return makeIMapIcon2(Pointer(address))
    }

    public override fun toNative(obj: IMapIcon2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1350098130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapIcon2): Array<IMapIcon2?> = (elements as
        Array<IMapIcon2?>).castToImpl<IMapIcon2,IMapIcon2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapIcon2?> = arrayOfNulls<IMapIcon2_Impl>(size)
        as Array<IMapIcon2?>
  }
}
