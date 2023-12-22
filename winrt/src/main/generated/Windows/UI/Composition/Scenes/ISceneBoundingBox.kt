package Windows.UI.Composition.Scenes

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISceneBoundingBox.ABI::class)
@Signature("{5d8ffc70-c618-4083-8251-9962593114aa}")
@Guid("5d8ffc70c618408382519962593114aa")
@WinRTInterface("5d8ffc70c618408382519962593114aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneBoundingBox.ByReference::class)
public interface ISceneBoundingBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Center(): Vector3?

  @InterfaceMethod(1)
  public fun get_Extents(): Vector3?

  @InterfaceMethod(2)
  public fun get_Max(): Vector3?

  @InterfaceMethod(3)
  public fun get_Min(): Vector3?

  @InterfaceMethod(4)
  public fun get_Size(): Vector3?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneBoundingBox> {
    public override fun getValue() = ABI.makeISceneBoundingBox(pointer.getPointer(0))

    public fun setValue(value: ISceneBoundingBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneBoundingBox {
    public val __1885365322_Ptr: Pointer?

    public val _1885365322_VtblPtr: Pointer?
      get() = __1885365322_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Center(): Vector3? {
      val fnPtr = _1885365322_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1885365322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Extents(): Vector3? {
      val fnPtr = _1885365322_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1885365322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Max(): Vector3? {
      val fnPtr = _1885365322_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1885365322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Min(): Vector3? {
      val fnPtr = _1885365322_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1885365322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Size(): Vector3? {
      val fnPtr = _1885365322_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1885365322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }
  }

  public class ISceneBoundingBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1885365322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneBoundingBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d8ffc70c618408382519962593114aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneBoundingBox(ptr: Pointer?): WithDefault = ISceneBoundingBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneBoundingBox {
      val address = segment.toRawLongValue()
      return makeISceneBoundingBox(Pointer(address))
    }

    public override fun toNative(obj: ISceneBoundingBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1885365322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneBoundingBox): Array<ISceneBoundingBox?> = (elements
        as Array<ISceneBoundingBox?>).castToImpl<ISceneBoundingBox,ISceneBoundingBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneBoundingBox?> =
        arrayOfNulls<ISceneBoundingBox_Impl>(size) as Array<ISceneBoundingBox?>
  }
}
