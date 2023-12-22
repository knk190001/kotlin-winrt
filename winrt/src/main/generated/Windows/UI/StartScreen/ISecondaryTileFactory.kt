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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISecondaryTileFactory.ABI::class)
@Signature("{57f52ca0-51bc-4abf-8ebf-627a0398b05a}")
@Guid("57f52ca051bc4abf8ebf627a0398b05a")
@WinRTInterface("57f52ca051bc4abf8ebf627a0398b05a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryTileFactory.ByReference::class)
public interface ISecondaryTileFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateTile(
    tileId: String?,
    shortName: String?,
    displayName: String?,
    arguments: String?,
    tileOptions: TileOptions?,
    logoReference: Uri?
  ): SecondaryTile?

  @InterfaceMethod(1)
  public fun CreateWideTile(
    tileId: String?,
    shortName: String?,
    displayName: String?,
    arguments: String?,
    tileOptions: TileOptions?,
    logoReference: Uri?,
    wideLogoReference: Uri?
  ): SecondaryTile?

  @InterfaceMethod(2)
  public fun CreateWithId(tileId: String?): SecondaryTile?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryTileFactory> {
    public override fun getValue() = ABI.makeISecondaryTileFactory(pointer.getPointer(0))

    public fun setValue(value: ISecondaryTileFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryTileFactory {
    public val __1005359662_Ptr: Pointer?

    public val _1005359662_VtblPtr: Pointer?
      get() = __1005359662_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateTile(
      tileId: String?,
      shortName: String?,
      displayName: String?,
      arguments: String?,
      tileOptions: TileOptions?,
      logoReference: Uri?
    ): SecondaryTile? {
      val fnPtr = _1005359662_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryTile>()
      val hr = fn.invokeHR(arrayOf(__1005359662_Ptr, marshalToNative(tileId),
          marshalToNative(shortName), marshalToNative(displayName), marshalToNative(arguments),
          marshalToNative(tileOptions), marshalToNative(logoReference), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SecondaryTile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWideTile(
      tileId: String?,
      shortName: String?,
      displayName: String?,
      arguments: String?,
      tileOptions: TileOptions?,
      logoReference: Uri?,
      wideLogoReference: Uri?
    ): SecondaryTile? {
      val fnPtr = _1005359662_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryTile>()
      val hr = fn.invokeHR(arrayOf(__1005359662_Ptr, marshalToNative(tileId),
          marshalToNative(shortName), marshalToNative(displayName), marshalToNative(arguments),
          marshalToNative(tileOptions), marshalToNative(logoReference),
          marshalToNative(wideLogoReference), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SecondaryTile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithId(tileId: String?): SecondaryTile? {
      val fnPtr = _1005359662_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SecondaryTile>()
      val hr = fn.invokeHR(arrayOf(__1005359662_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SecondaryTile>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryTileFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1005359662_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryTileFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("57f52ca051bc4abf8ebf627a0398b05a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryTileFactory(ptr: Pointer?): WithDefault =
        ISecondaryTileFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISecondaryTileFactory {
      val address = segment.toRawLongValue()
      return makeISecondaryTileFactory(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryTileFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1005359662_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryTileFactory): Array<ISecondaryTileFactory?> =
        (elements as
        Array<ISecondaryTileFactory?>).castToImpl<ISecondaryTileFactory,ISecondaryTileFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryTileFactory?> =
        arrayOfNulls<ISecondaryTileFactory_Impl>(size) as Array<ISecondaryTileFactory?>
  }
}
