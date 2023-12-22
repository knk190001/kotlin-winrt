package Microsoft.UI.Input.Experimental

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IExpPointerPoint.ABI::class)
@Signature("{f9dc0c95-f286-5a1c-b038-7ff84a4e4af5}")
@Guid("f9dc0c95f2865a1cb0387ff84a4e4af5")
@WinRTInterface("f9dc0c95f2865a1cb0387ff84a4e4af5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpPointerPoint.ByReference::class)
public interface IExpPointerPoint : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpPointerPoint> {
    public override fun getValue() = ABI.makeIExpPointerPoint(pointer.getPointer(0))

    public fun setValue(value: IExpPointerPoint_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpPointerPoint {
    public val __1157994035_Ptr: Pointer?

    public val _1157994035_VtblPtr: Pointer?
      get() = __1157994035_Ptr?.getPointer(0)
  }

  public class IExpPointerPoint_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1157994035_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpPointerPoint, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f9dc0c95f2865a1cb0387ff84a4e4af5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpPointerPoint(ptr: Pointer?): WithDefault = IExpPointerPoint_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpPointerPoint {
      val address = segment.toRawLongValue()
      return makeIExpPointerPoint(Pointer(address))
    }

    public override fun toNative(obj: IExpPointerPoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1157994035_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpPointerPoint): Array<IExpPointerPoint?> = (elements as
        Array<IExpPointerPoint?>).castToImpl<IExpPointerPoint,IExpPointerPoint_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpPointerPoint?> =
        arrayOfNulls<IExpPointerPoint_Impl>(size) as Array<IExpPointerPoint?>
  }
}
