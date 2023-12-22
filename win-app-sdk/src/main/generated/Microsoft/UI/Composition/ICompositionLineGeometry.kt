package Microsoft.UI.Composition

import Windows.Foundation.Numerics.Vector2
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

@ABIMarker(ICompositionLineGeometry.ABI::class)
@Signature("{489f9382-c186-5936-8946-c4f927e844aa}")
@Guid("489f9382c18659368946c4f927e844aa")
@WinRTInterface("489f9382c18659368946c4f927e844aa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionLineGeometry.ByReference::class)
public interface ICompositionLineGeometry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Start(): Vector2?

  @InterfaceMethod(1)
  public fun put_Start(value: Vector2?): Unit

  @InterfaceMethod(2)
  public fun get_End(): Vector2?

  @InterfaceMethod(3)
  public fun put_End(value: Vector2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionLineGeometry> {
    public override fun getValue() = ABI.makeICompositionLineGeometry(pointer.getPointer(0))

    public fun setValue(value: ICompositionLineGeometry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionLineGeometry {
    public val __159400727_Ptr: Pointer?

    public val _159400727_VtblPtr: Pointer?
      get() = __159400727_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Start(): Vector2? {
      val fnPtr = _159400727_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__159400727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Start(value: Vector2?): Unit {
      val fnPtr = _159400727_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__159400727_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_End(): Vector2? {
      val fnPtr = _159400727_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__159400727_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_End(value: Vector2?): Unit {
      val fnPtr = _159400727_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__159400727_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionLineGeometry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __159400727_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionLineGeometry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("489f9382c18659368946c4f927e844aa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionLineGeometry(ptr: Pointer?): WithDefault =
        ICompositionLineGeometry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionLineGeometry {
      val address = segment.toRawLongValue()
      return makeICompositionLineGeometry(Pointer(address))
    }

    public override fun toNative(obj: ICompositionLineGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__159400727_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionLineGeometry):
        Array<ICompositionLineGeometry?> = (elements as
        Array<ICompositionLineGeometry?>).castToImpl<ICompositionLineGeometry,ICompositionLineGeometry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionLineGeometry?> =
        arrayOfNulls<ICompositionLineGeometry_Impl>(size) as Array<ICompositionLineGeometry?>
  }
}
