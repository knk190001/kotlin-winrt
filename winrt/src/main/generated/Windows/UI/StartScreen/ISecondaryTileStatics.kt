package Windows.UI.StartScreen

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISecondaryTileStatics.ABI::class)
@Signature("{99908dae-d051-4676-87fe-9ec242d83c74}")
@Guid("99908daed051467687fe9ec242d83c74")
@WinRTInterface("99908daed051467687fe9ec242d83c74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISecondaryTileStatics.ByReference::class)
public interface ISecondaryTileStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Exists(tileId: String?): Boolean

  @InterfaceMethod(1)
  public fun FindAllAsync(): IAsyncOperation<IVectorView<SecondaryTile?>?>?

  @InterfaceMethod(2)
  public fun FindAllAsync(applicationId: String?): IAsyncOperation<IVectorView<SecondaryTile?>?>?

  @InterfaceMethod(3)
  public fun FindAllForPackageAsync(): IAsyncOperation<IVectorView<SecondaryTile?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISecondaryTileStatics> {
    public override fun getValue() = ABI.makeISecondaryTileStatics(pointer.getPointer(0))

    public fun setValue(value: ISecondaryTileStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISecondaryTileStatics {
    public val __1810613107_Ptr: Pointer?

    public val _1810613107_VtblPtr: Pointer?
      get() = __1810613107_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Exists(tileId: String?): Boolean {
      val fnPtr = _1810613107_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1810613107_Ptr, marshalToNative(tileId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun FindAllAsync(): IAsyncOperation<IVectorView<SecondaryTile?>?>? {
      val fnPtr = _1810613107_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<SecondaryTile?>?>>()
      val hr = fn.invokeHR(arrayOf(__1810613107_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<SecondaryTile?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FindAllAsync(applicationId: String?):
        IAsyncOperation<IVectorView<SecondaryTile?>?>? {
      val fnPtr = _1810613107_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<SecondaryTile?>?>>()
      val hr = fn.invokeHR(arrayOf(__1810613107_Ptr, marshalToNative(applicationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<SecondaryTile?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FindAllForPackageAsync(): IAsyncOperation<IVectorView<SecondaryTile?>?>? {
      val fnPtr = _1810613107_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<SecondaryTile?>?>>()
      val hr = fn.invokeHR(arrayOf(__1810613107_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<SecondaryTile?>?>>(result.getValue())
      return resultValue
    }
  }

  public class ISecondaryTileStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1810613107_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISecondaryTileStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("99908daed051467687fe9ec242d83c74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISecondaryTileStatics(ptr: Pointer?): WithDefault =
        ISecondaryTileStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISecondaryTileStatics {
      val address = segment.toRawLongValue()
      return makeISecondaryTileStatics(Pointer(address))
    }

    public override fun toNative(obj: ISecondaryTileStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1810613107_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISecondaryTileStatics): Array<ISecondaryTileStatics?> =
        (elements as
        Array<ISecondaryTileStatics?>).castToImpl<ISecondaryTileStatics,ISecondaryTileStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISecondaryTileStatics?> =
        arrayOfNulls<ISecondaryTileStatics_Impl>(size) as Array<ISecondaryTileStatics?>
  }
}
