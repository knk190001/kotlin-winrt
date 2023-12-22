package Windows.UI.StartScreen

import Windows.Foundation.Uri
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

@ABIMarker(ISecondaryTileVisualElements2.ABI::class)
@Signature("{fd2e31d0-57dc-4794-8ecf-5682f5f3e6ef}")
@Guid("fd2e31d057dc47948ecf5682f5f3e6ef")
@WinRTInterface("fd2e31d057dc47948ecf5682f5f3e6ef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryTileVisualElements2.ByReference::class)
public interface ISecondaryTileVisualElements2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun put_Square71x71Logo(value: Uri?): Unit

  @InterfaceMethod(1)
  public fun get_Square71x71Logo(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryTileVisualElements2> {
    public override fun getValue() = ABI.makeISecondaryTileVisualElements2(pointer.getPointer(0))

    public fun setValue(value: ISecondaryTileVisualElements2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryTileVisualElements2 {
    public val __696839293_Ptr: Pointer?

    public val _696839293_VtblPtr: Pointer?
      get() = __696839293_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun put_Square71x71Logo(value: Uri?): Unit {
      val fnPtr = _696839293_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__696839293_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Square71x71Logo(): Uri? {
      val fnPtr = _696839293_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__696839293_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryTileVisualElements2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __696839293_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryTileVisualElements2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd2e31d057dc47948ecf5682f5f3e6ef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryTileVisualElements2(ptr: Pointer?): WithDefault =
        ISecondaryTileVisualElements2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISecondaryTileVisualElements2 {
      val address = segment.toRawLongValue()
      return makeISecondaryTileVisualElements2(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryTileVisualElements2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__696839293_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryTileVisualElements2):
        Array<ISecondaryTileVisualElements2?> = (elements as
        Array<ISecondaryTileVisualElements2?>).castToImpl<ISecondaryTileVisualElements2,ISecondaryTileVisualElements2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryTileVisualElements2?> =
        arrayOfNulls<ISecondaryTileVisualElements2_Impl>(size) as
        Array<ISecondaryTileVisualElements2?>
  }
}
