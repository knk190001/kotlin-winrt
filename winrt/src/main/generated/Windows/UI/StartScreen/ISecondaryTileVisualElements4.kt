package Windows.UI.StartScreen

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

@ABIMarker(ISecondaryTileVisualElements4.ABI::class)
@Signature("{66566117-b544-40d2-8d12-74d4ec24d04c}")
@Guid("66566117b54440d28d1274d4ec24d04c")
@WinRTInterface("66566117b54440d28d1274d4ec24d04c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryTileVisualElements4.ByReference::class)
public interface ISecondaryTileVisualElements4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MixedRealityModel(): TileMixedRealityModel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryTileVisualElements4> {
    public override fun getValue() = ABI.makeISecondaryTileVisualElements4(pointer.getPointer(0))

    public fun setValue(value: ISecondaryTileVisualElements4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryTileVisualElements4 {
    public val __696839291_Ptr: Pointer?

    public val _696839291_VtblPtr: Pointer?
      get() = __696839291_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MixedRealityModel(): TileMixedRealityModel? {
      val fnPtr = _696839291_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileMixedRealityModel>()
      val hr = fn.invokeHR(arrayOf(__696839291_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileMixedRealityModel>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryTileVisualElements4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __696839291_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryTileVisualElements4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("66566117b54440d28d1274d4ec24d04c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryTileVisualElements4(ptr: Pointer?): WithDefault =
        ISecondaryTileVisualElements4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISecondaryTileVisualElements4 {
      val address = segment.toRawLongValue()
      return makeISecondaryTileVisualElements4(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryTileVisualElements4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__696839291_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryTileVisualElements4):
        Array<ISecondaryTileVisualElements4?> = (elements as
        Array<ISecondaryTileVisualElements4?>).castToImpl<ISecondaryTileVisualElements4,ISecondaryTileVisualElements4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryTileVisualElements4?> =
        arrayOfNulls<ISecondaryTileVisualElements4_Impl>(size) as
        Array<ISecondaryTileVisualElements4?>
  }
}
