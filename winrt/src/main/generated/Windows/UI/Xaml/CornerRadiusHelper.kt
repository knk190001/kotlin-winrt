package Windows.UI.Xaml

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

@ABIMarker(CornerRadiusHelper.ABI::class)
@Signature("rc(Windows.UI.Xaml.CornerRadiusHelper;{fd7be182-1cdb-4288-b8c8-85ee79297bfc})")
@WinRTByReference(brClass = CornerRadiusHelper.ByReference::class)
public class CornerRadiusHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICornerRadiusHelper.WithDefault, IWinRTObject {
  private val __2105100377_Interface: ICornerRadiusHelper.WithDefault by lazy {
    as_2105100377()
  }


  public override val __2105100377_Ptr: JNAPointer? by lazy {
    __2105100377_Interface.__2105100377_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2105100377_Interface)

  private fun as_2105100377(): ICornerRadiusHelper.WithDefault {
    if(pointer == NULL) {
      return(ICornerRadiusHelper.ABI.makeICornerRadiusHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICornerRadiusHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICornerRadiusHelper.ABI.makeICornerRadiusHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CornerRadiusHelper> {
    public override fun getValue() = CornerRadiusHelper(pointer.getPointer(0))

    public fun setValue(value: CornerRadiusHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CornerRadiusHelper, MemoryAddress> {
    public val ICornerRadiusHelperStatics_Instance: ICornerRadiusHelperStatics by lazy {
      createICornerRadiusHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICornerRadiusHelperStatics(): ICornerRadiusHelperStatics {
      val refiid = Guid.REFIID(ICornerRadiusHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.CornerRadiusHelper".toHandle(),refiid,interfacePtr)
      val result = ICornerRadiusHelperStatics.ABI.makeICornerRadiusHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CornerRadiusHelper {
      val address = segment.toRawLongValue()
      return CornerRadiusHelper(Pointer(address))
    }

    public override fun toNative(obj: CornerRadiusHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromRadii(
      topLeft: Double,
      topRight: Double,
      bottomRight: Double,
      bottomLeft: Double
    ) = ABI.ICornerRadiusHelperStatics_Instance.FromRadii(topLeft, topRight, bottomRight,
        bottomLeft)

    public fun FromUniformRadius(uniformRadius: Double) =
        ABI.ICornerRadiusHelperStatics_Instance.FromUniformRadius(uniformRadius)
  }
}
