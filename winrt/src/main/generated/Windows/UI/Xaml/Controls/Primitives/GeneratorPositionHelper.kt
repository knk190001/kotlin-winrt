package Windows.UI.Xaml.Controls.Primitives

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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(GeneratorPositionHelper.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.GeneratorPositionHelper;{cd40318d-7745-40d9-ab9d-abbda4a7ffea})")
@WinRTByReference(brClass = GeneratorPositionHelper.ByReference::class)
public class GeneratorPositionHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeneratorPositionHelper.WithDefault, IWinRTObject {
  private val __1022588530_Interface: IGeneratorPositionHelper.WithDefault by lazy {
    as_1022588530()
  }


  public override val __1022588530_Ptr: JNAPointer? by lazy {
    __1022588530_Interface.__1022588530_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1022588530_Interface)

  private fun as_1022588530(): IGeneratorPositionHelper.WithDefault {
    if(pointer == NULL) {
      return(IGeneratorPositionHelper.ABI.makeIGeneratorPositionHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeneratorPositionHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeneratorPositionHelper.ABI.makeIGeneratorPositionHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GeneratorPositionHelper> {
    public override fun getValue() = GeneratorPositionHelper(pointer.getPointer(0))

    public fun setValue(value: GeneratorPositionHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeneratorPositionHelper, MemoryAddress> {
    public val IGeneratorPositionHelperStatics_Instance: IGeneratorPositionHelperStatics by lazy {
      createIGeneratorPositionHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGeneratorPositionHelperStatics(): IGeneratorPositionHelperStatics {
      val refiid = Guid.REFIID(IGeneratorPositionHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.GeneratorPositionHelper".toHandle(),refiid,interfacePtr)
      val result =
          IGeneratorPositionHelperStatics.ABI.makeIGeneratorPositionHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GeneratorPositionHelper {
      val address = segment.toRawLongValue()
      return GeneratorPositionHelper(Pointer(address))
    }

    public override fun toNative(obj: GeneratorPositionHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIndexAndOffset(index: Int, offset: Int) =
        ABI.IGeneratorPositionHelperStatics_Instance.FromIndexAndOffset(index, offset)
  }
}
