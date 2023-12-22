package Windows.UI.StartScreen

import Windows.Foundation.Uri
import Windows.UI.StartScreen.ISecondaryTileFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISecondaryTileFactory2.ABI::class)
@Signature("{274b8a3b-522d-448e-9eb2-d0672ab345c8}")
@Guid("274b8a3b522d448e9eb2d0672ab345c8")
@WinRTInterface("274b8a3b522d448e9eb2d0672ab345c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryTileFactory2.ByReference::class)
public interface ISecondaryTileFactory2 : NativeMapped, IWinRTInterface, ISecondaryTileFactory {
  @InterfaceMethod(0)
  public fun CreateMinimalTile(
    tileId: String?,
    displayName: String?,
    arguments: String?,
    square150x150Logo: Uri?,
    desiredSize: TileSize?
  ): SecondaryTile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryTileFactory2> {
    public override fun getValue() = ABI.makeISecondaryTileFactory2(pointer.getPointer(0))

    public fun setValue(value: ISecondaryTileFactory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryTileFactory2, ISecondaryTileFactory.WithDefault {
    public val __1101378400_Ptr: Pointer?

    public val _1101378400_VtblPtr: Pointer?
      get() = __1101378400_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMinimalTile(
      tileId: String?,
      displayName: String?,
      arguments: String?,
      square150x150Logo: Uri?,
      desiredSize: TileSize?
    ): SecondaryTile? {
      val fnPtr = _1101378400_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryTile>()
      val hr = fn.invokeHR(arrayOf(__1101378400_Ptr, marshalToNative(tileId),
          marshalToNative(displayName), marshalToNative(arguments),
          marshalToNative(square150x150Logo), marshalToNative(desiredSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SecondaryTile>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryTileFactory2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, ISecondaryTileFactory {
    public override val __1005359662_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1101378400_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1101378400_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryTileFactory2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("274b8a3b522d448e9eb2d0672ab345c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryTileFactory2(ptr: Pointer?): WithDefault =
        ISecondaryTileFactory2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISecondaryTileFactory2 {
      val address = segment.toRawLongValue()
      return makeISecondaryTileFactory2(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryTileFactory2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1101378400_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryTileFactory2): Array<ISecondaryTileFactory2?> =
        (elements as
        Array<ISecondaryTileFactory2?>).castToImpl<ISecondaryTileFactory2,ISecondaryTileFactory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryTileFactory2?> =
        arrayOfNulls<ISecondaryTileFactory2_Impl>(size) as Array<ISecondaryTileFactory2?>
  }
}
