package Windows.UI.Input.Spatial

import Windows.Perception.Spatial.SpatialCoordinateSystem
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISpatialTappedEventArgs.ABI::class)
@Signature("{296d83de-f444-4aa1-b2bf-9dc88d567da6}")
@Guid("296d83def4444aa1b2bf9dc88d567da6")
@WinRTInterface("296d83def4444aa1b2bf9dc88d567da6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialTappedEventArgs.ByReference::class)
public interface ISpatialTappedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InteractionSourceKind(): SpatialInteractionSourceKind?

  @InterfaceMethod(1)
  public fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?): SpatialPointerPose?

  @InterfaceMethod(2)
  public fun get_TapCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialTappedEventArgs> {
    public override fun getValue() = ABI.makeISpatialTappedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialTappedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialTappedEventArgs {
    public val __84365151_Ptr: Pointer?

    public val _84365151_VtblPtr: Pointer?
      get() = __84365151_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InteractionSourceKind(): SpatialInteractionSourceKind? {
      val fnPtr = _84365151_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceKind>()
      val hr = fn.invokeHR(arrayOf(__84365151_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?):
        SpatialPointerPose? {
      val fnPtr = _84365151_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialPointerPose>()
      val hr = fn.invokeHR(arrayOf(__84365151_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialPointerPose>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TapCount(): WinDef.UINT {
      val fnPtr = _84365151_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__84365151_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ISpatialTappedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __84365151_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialTappedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("296d83def4444aa1b2bf9dc88d567da6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialTappedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialTappedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialTappedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialTappedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialTappedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__84365151_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialTappedEventArgs): Array<ISpatialTappedEventArgs?>
        = (elements as
        Array<ISpatialTappedEventArgs?>).castToImpl<ISpatialTappedEventArgs,ISpatialTappedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialTappedEventArgs?> =
        arrayOfNulls<ISpatialTappedEventArgs_Impl>(size) as Array<ISpatialTappedEventArgs?>
  }
}
