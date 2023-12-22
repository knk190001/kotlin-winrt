package Windows.UI.Xaml.Media.Media3D

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Matrix3DHelper.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Media3D.Matrix3DHelper;{e48c10ef-9927-4c9b-8213-07775512ba04})")
@WinRTByReference(brClass = Matrix3DHelper.ByReference::class)
public class Matrix3DHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMatrix3DHelper.WithDefault, IWinRTObject {
  private val __1860373013_Interface: IMatrix3DHelper.WithDefault by lazy {
    as_1860373013()
  }


  public override val __1860373013_Ptr: JNAPointer? by lazy {
    __1860373013_Interface.__1860373013_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1860373013_Interface)

  private fun as_1860373013(): IMatrix3DHelper.WithDefault {
    if(pointer == NULL) {
      return(IMatrix3DHelper.ABI.makeIMatrix3DHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMatrix3DHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMatrix3DHelper.ABI.makeIMatrix3DHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Matrix3DHelper>
      {
    public override fun getValue() = Matrix3DHelper(pointer.getPointer(0))

    public fun setValue(value: Matrix3DHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Matrix3DHelper, MemoryAddress> {
    public val IMatrix3DHelperStatics_Instance: IMatrix3DHelperStatics by lazy {
      createIMatrix3DHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMatrix3DHelperStatics(): IMatrix3DHelperStatics {
      val refiid = Guid.REFIID(IMatrix3DHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Media3D.Matrix3DHelper".toHandle(),refiid,interfacePtr)
      val result = IMatrix3DHelperStatics.ABI.makeIMatrix3DHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): Matrix3DHelper {
      val address = segment.toRawLongValue()
      return Matrix3DHelper(Pointer(address))
    }

    public override fun toNative(obj: Matrix3DHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Identity() = ABI.IMatrix3DHelperStatics_Instance.get_Identity()

    public fun Multiply(matrix1: Matrix3D, matrix2: Matrix3D) =
        ABI.IMatrix3DHelperStatics_Instance.Multiply(matrix1, matrix2)

    public fun FromElements(
      m11: Double,
      m12: Double,
      m13: Double,
      m14: Double,
      m21: Double,
      m22: Double,
      m23: Double,
      m24: Double,
      m31: Double,
      m32: Double,
      m33: Double,
      m34: Double,
      offsetX: Double,
      offsetY: Double,
      offsetZ: Double,
      m44: Double
    ) = ABI.IMatrix3DHelperStatics_Instance.FromElements(m11, m12, m13, m14, m21, m22, m23, m24,
        m31, m32, m33, m34, offsetX, offsetY, offsetZ, m44)

    public fun GetHasInverse(target: Matrix3D) =
        ABI.IMatrix3DHelperStatics_Instance.GetHasInverse(target)

    public fun GetIsIdentity(target: Matrix3D) =
        ABI.IMatrix3DHelperStatics_Instance.GetIsIdentity(target)

    public fun Invert(target: Matrix3D) = ABI.IMatrix3DHelperStatics_Instance.Invert(target)
  }
}
